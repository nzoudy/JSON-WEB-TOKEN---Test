package com.zoudys.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JsonWebTokenTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JsonWebTokenTestApplication.class, args);
		
		
	}
}
