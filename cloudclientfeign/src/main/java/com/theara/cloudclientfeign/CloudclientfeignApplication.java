package com.theara.cloudclientfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CloudclientfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudclientfeignApplication.class, args);
	}

}
