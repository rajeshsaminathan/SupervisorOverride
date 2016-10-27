package com.ignite.receivingservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReceivingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceivingApplication.class, args);
		System.out.println("Hello");
	}
}
