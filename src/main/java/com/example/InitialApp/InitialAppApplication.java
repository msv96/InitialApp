package com.example.InitialApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InitialAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialAppApplication.class, args);
	}

	@GetMapping("/new-app")
	public String hello() {
		return "Hi all";
	}
}
