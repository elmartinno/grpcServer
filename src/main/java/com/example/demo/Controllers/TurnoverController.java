package com.example.demo.Controllers;

import com.example.demo.Logs;
import com.example.demo.model.Turnover;
import com.grpc.getAccountsClasses.*;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import io.grpc.stub.StreamObserver;
import org.bson.Document;

import java.util.ArrayList;

public class TurnoverController extends TurnoverServiceGrpc.TurnoverServiceImplBase {
    private MongoClient mongoClient = MongoClients.create("mongodb://user3UQ:3JllWgKjDl8MJXQx@mongodb");
    private MongoDatabase mongoDatabase = mongoClient.getDatabase("sampledb");
    private MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("turnovers");

    private Logs l = new Logs();

    @Override
    public void removeTurnover(removeTurnoverRequest request, StreamObserver<removeTurnoverResponse> responseObserver){
        l.startLog();

        if(mongoCollection.find(Filters.eq("accountIban", request.getS()))!=null)
            mongoCollection.deleteMany(Filters.eq("accountIban",request.getS()));

        removeTurnoverResponse response = removeTurnoverResponse
                .newBuilder()
                .build();

        l.createLog("removeTurnover",request.getS());

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void updateTurnover(updateTurnoverRequest request, StreamObserver<updateTurnoverResponse> responseObserver){
        l.startLog();

        ArrayList<Document>arrayList = new ArrayList<>();
        if(mongoCollection.find(Filters.eq("accountIban", request.getAccount(0).getAccountIban()))!=null)
            for(TurnoverGrpc t : request.getAccountList())
                mongoCollection.replaceOne(
                        Filters.eq("accountIban",t.getAccountIban()),
                        TurnoverGrpcToDocument(t)
                );



        updateTurnoverResponse response = updateTurnoverResponse
                .newBuilder()
                .build();

        l.createLog("updateTurnover",request.getAccount(0).getAccountIban());

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void addTurnover(addTurnoverRequest request, StreamObserver<addTurnoverResponse> responseObserver){
        l.startLog();

        mongoCollection.insertOne(TurnoverGrpcToDocument(request.getAccount()));
        addTurnoverResponse response = addTurnoverResponse
                .newBuilder()
                .build();

        l.createLog("addTurnover",request.getAccount().getAccountIban());

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void findTurnoverByIban(findTurnoverByIbanRequest request, StreamObserver<findTurnoverByIbanResponse> responseObserver){
        l.startLog();

        FindIterable<Document> turnovers = mongoCollection.find(Filters.eq("accountIban", request.getS()));
        findTurnoverByIbanResponse.Builder builder = findTurnoverByIbanResponse.newBuilder();
        for (Document t : turnovers)
            builder.addAccount(DocumentToTurnoverGRPC(t));


        l.createLog("findTurnoverByIban",request.getS());

        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    public TurnoverGrpc DocumentToTurnoverGRPC(Document turnovers){

        TurnoverGrpc.Builder builder = TurnoverGrpc.newBuilder();
        builder.setAccountIban((String) turnovers.get("accountIban"))
                .setVariable((String) turnovers.get("variable"))
                .setSpecific((String) turnovers.get("specific"))
                .setDescription((String) turnovers.get("description"))
                .setCounterAccountName((String) turnovers.get("counterAccountName"))
                .setNote((String) turnovers.get("note"));

        return builder.build();
    }
    public Document TurnoverGrpcToDocument(TurnoverGrpc t){
        Document document = new Document()
                .append("accountIban", t.getAccountIban())
                .append("counterAccountName",t.getCounterAccountName())
                .append("description",t.getDescription())
                .append("specific",t.getSpecific())
                .append("variable",t.getVariable())
                .append("note",t.getNote());
        return document;
    }

}
