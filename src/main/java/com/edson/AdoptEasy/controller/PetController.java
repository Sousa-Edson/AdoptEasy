package com.edson.AdoptEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Controller
public class PetController {

//	private static List<Pet> listaPet = new ArrayList<Pet>();

	 

//	@GetMapping("/pet")
//	public String form() {
//		return "pet/pet-form";
//	}

//	@PostMapping("/pet")
//	public String novo(
//			@RequestParam("id") int id,
//			@RequestParam("nome") String nome,
//			@RequestParam("raca") String raca,
//			@RequestParam("idade") int idade,
//			Model model) {
//		
//		model.addAttribute("id", id);
//		model.addAttribute("nome", nome);
//		model.addAttribute("raca", raca);
//		model.addAttribute("idade", idade);
//		
//		return "pet/pet-criado";
//	}

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

	
  
	
//	@PostMapping("/pet")
//	public ModelAndView novo(Pet pet) {
//
//		ModelAndView mv = new ModelAndView("pet/pet-criado");
//
//		listaPet.add(pet);
//
//		// insert no banco de dados
//		mv.addObject("pet", pet);
//
//		return mv;
//	}

//	@GetMapping("/pet/list")
//	public String list(Model model) {
//		model.addAttribute("pet", listaPet);
//		return "pet/pet-list";
//	}
//
//	@GetMapping("/pet/{id}")
//	public String detalhe(@PathVariable("id") int id, Model model) {
//		for (Pet p : listaPet) {
//			if (p.getId() == id) {
//				model.addAttribute("pet", p);
//				break;
//			}
//		}
//		return "pet/pet-detalhe";
//	}

}