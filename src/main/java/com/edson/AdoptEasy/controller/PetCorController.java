package com.edson.AdoptEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetCorController {
	
	@GetMapping("/pet")
	public String novo() {
		return "pet/pet-cor";
	}

}
