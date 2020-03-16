package com.example.demo.Controllers;

import com.example.demo.Logs;
import com.grpc.getAccountsClasses.*;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import io.grpc.stub.StreamObserver;
import org.bson.BsonDocument;
import org.bson.Document;

public class AccountController extends AccountServiceGrpc.AccountServiceImplBase {
    private MongoClient mongoClient = MongoClients.create("mongodb://user3UQ:3JllWgKjDl8MJXQx@mongodb/sampledb");
    private MongoDatabase mongoDatabase = mongoClient.getDatabase("sampledb");
    private MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("accounts");

    private Logs l = new Logs();

    @Override
    public void removeAccount(removeAccountRequest request, StreamObserver<removeAccountResponse> responseObserver){
        l.startLog();

        if(mongoCollection.find(Filters.eq("iban", request.getS()))!=null)
            mongoCollection.deleteMany(Filters.eq("iban",request.getS()));
        else
            System.out.println("Nemas co mazat");

        removeAccountResponse response = removeAccountResponse
                .newBuilder()
                .build();

        l.createLog("removeAccount",request.getS());

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void findAccountByIban(findAccountByIbanRequest request, StreamObserver<findAccountByIbanResponse> responseObserver){
        l.startLog();

        Document account = mongoCollection.find(Filters.eq("iban", request.getS())).first();
        AccountGrpc acc = DocumentToAccountGRPC(account);
        findAccountByIbanResponse response = findAccountByIbanResponse
                .newBuilder()
                .setAccount(acc)
                .build();

        l.createLog("findAccountByIban",request.getS());

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void addAccount(addAccountRequest request, StreamObserver<addAccountResponse> responseObserver){
        l.startLog();

        if(mongoCollection.find(Filters.eq("iban", request.getAccount().getIban()))!=null) {
            mongoCollection.insertOne(AccountGrpcToDocument(request.getAccount()));
            System.out.println(AccountGrpcToDocument(request.getAccount()));
        }
        else
            System.out.println("toten iban uz jestvuje");

        addAccountResponse response = addAccountResponse
                .newBuilder()
                .build();

        l.createLog("addAccount",request.getAccount().getIban());

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void updateAccount(updateAccountRequest request, StreamObserver<updateAccountResponse> responseObserver){
        l.startLog();
        if(mongoCollection.find(Filters.eq("iban", request.getAccount().getIban()))!=null)
            mongoCollection.replaceOne(
                    Filters.eq("iban",request.getAccount().getIban()),
                    AccountGrpcToDocument(request.getAccount())
            );
        else
            System.out.println("nemas co updatnut");

        updateAccountResponse response = updateAccountResponse
                .newBuilder()
                .build();

        l.createLog("updateAccount",request.getAccount().getIban());

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void accounts(accountsRequest request, StreamObserver<accountsResponse> responseObserver){
        l.startLog();

        accountsResponse.Builder builder = accountsResponse
                .newBuilder();
        //mongoCollection.find().iterator().forEachRemaining(a -> builder.addAccounts(DocumentToAccountGRPC(a)));
        builder.addAccounts(DocumentToAccountGRPC(mongoCollection.find().first()));
        builder.addAccounts(DocumentToAccountGRPC(mongoCollection.find().first()));
        accountsResponse response = builder.build();

        l.createLog("accounts","all");

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    public Document AccountGrpcToDocument(AccountGrpc account){
        Document document = new Document(/*"_id", account.getId()*/)
                .append("created", account.getCreated())
                .append("update", account.getUpdate())
                .append("iban", account.getIban())
                //.append("balance", account.getBalance())
                .append("published", account.getPublished())
                .append("hidden", account.getHidden());
        return document;
    }

    public AccountGrpc DocumentToAccountGRPC(Document myData){
        //Document d =(Document) myData.get("balance");
        System.out.println(myData);
        com.grpc.getAccountsClasses.AccountGrpc response = com.grpc.getAccountsClasses.AccountGrpc.newBuilder()
               // .setId(myData.get("_id").toString())
                .setBalance(com.grpc.getAccountsClasses.BalanceGRpc.newBuilder()
//                        .setValue( d.get("value").toString())
//                        .setPrecision(d.get("precision").toString())//(String) myData.get("balance"))
//                        .setCurrency( d.get("currency").toString())//(String) myData.get("balance"))
                        .build())
                .setCreated((String) myData.get("created"))
                .setUpdate((String) myData.get("update"))
                .setIban((String) myData.get("iban"))
                .setPublished((String) myData.get("published"))
                .setHidden(myData.get("hidden").toString())
                .build();
        return response;
    }
}
