package com.example.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		//SpringApplication.run(DemoApplication.class, args);
		GrpcServerStartConfiguration grpc = new GrpcServerStartConfiguration();
		grpc.startGrpcServer();

	}



}

