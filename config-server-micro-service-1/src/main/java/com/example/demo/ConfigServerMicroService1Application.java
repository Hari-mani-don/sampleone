package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerMicroService1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMicroService1Application.class, args);
		
	}

}
