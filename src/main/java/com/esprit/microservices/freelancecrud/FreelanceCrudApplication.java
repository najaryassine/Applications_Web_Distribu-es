package com.esprit.microservices.freelancecrud;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
@EnableEurekaClient
@SpringBootApplication
public class FreelanceCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreelanceCrudApplication.class, args);
	}


}
