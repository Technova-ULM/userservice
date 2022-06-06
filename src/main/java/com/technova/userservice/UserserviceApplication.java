package com.technova.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * It's a Spring Boot application that has a single method, main(), which is used to run the application
 */
@SpringBootApplication
public class UserserviceApplication {

	// This is the main method which is used to run the spring boot application.
	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

}
