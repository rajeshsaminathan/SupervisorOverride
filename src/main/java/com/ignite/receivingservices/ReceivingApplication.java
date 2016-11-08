package com.ignite.receivingservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ReceivingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceivingApplication.class, args);
		System.out.println("Hello");
	}
}
