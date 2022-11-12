package com.edson.AdoptEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PetController {

	@GetMapping("/pet")
	public String novo() {
		return "pet/home";
	}

	@PostMapping("/pet")
	public String home() {
		return "pet/home";
	}

	@GetMapping("/pet/login")
	public String login() {
		return "pet/login";
	}

}