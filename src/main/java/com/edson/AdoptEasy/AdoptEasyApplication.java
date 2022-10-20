package com.edson.AdoptEasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AdoptEasyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdoptEasyApplication.class, args);
	}
	@GetMapping("/")
	public String index() {
		return "adote pet";
	}
}
