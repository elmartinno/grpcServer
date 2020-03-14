package com.example.demo;


import com.example.demo.Controllers.AccountController;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.BindableService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.GrpcServerStartConfiguration;
import java.io.IOException;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("a");
		//SpringApplication.run(DemoApplication.class, args);
		GrpcServerStartConfiguration grpc = new GrpcServerStartConfiguration();
		System.out.println("b");
		grpc.startGrpcServer();
//		Server server = ServerBuilder.forPort(8050)
//				.addService(new AccountController())
//				//.addService(new TurnoverController())
//				//.addService(ProtoReflectionService.newInstance()) // added Reflection
//				.build();
//		server.start();
//		System.out.println("Started");
//
//		// Shutdown: Using Runtime shutdown server [Imp: before await Termination]
//		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//			System.out.println("Received Shutdown Request");
//			server.shutdown();
//			System.out.println("Successfully, Stopped Shutdown the server");
//		}));
//
//		server.awaitTermination();
	}

}

