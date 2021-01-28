package com.example.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServideRegistryApplication {

	// This is the server
	public static void main(String[] args) {
		SpringApplication.run(ServideRegistryApplication.class, args);
	}

}
