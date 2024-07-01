package com.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerMicroServiceApplication.class, args);
	}

}
