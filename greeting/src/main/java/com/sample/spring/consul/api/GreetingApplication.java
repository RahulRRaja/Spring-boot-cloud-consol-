package com.sample.spring.consul.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GreetingApplication {
	
	@GetMapping("/greeting")
	public String getMessage() {
		return "Welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(GreetingServiceApplication.class, args);
	}

}
