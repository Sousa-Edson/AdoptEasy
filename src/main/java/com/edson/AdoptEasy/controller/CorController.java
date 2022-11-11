package com.edson.AdoptEasy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edson.AdoptEasy.model.PetCor;
import com.edson.AdoptEasy.repository.CorRepository;

@Controller
public class CorController {
	@Autowired
	private CorRepository repository;
    
  

	

	@PostMapping("/pet/pet-cor")
	public ModelAndView novo(PetCor cor) {

		ModelAndView mv = new ModelAndView("redirect:../pet/pet-cor");
		
			repository.save(cor);


		return mv;
	}

	@GetMapping("/pet/pet-cor")
	public String list(Model model) {
		model.addAttribute("c", new PetCor());
		model.addAttribute("cor", repository.findAll());
		return "pet/pet-cor";
	}

	@GetMapping("/pet/pet-cor/{id}")
	public String detalhe(@PathVariable("id") int id, Model model) {
		PetCor c = repository.findById(id);;  
			if (c == null) {
				return "cor-nao-encontrada";
				
			}model.addAttribute("c", c);
			
		return "pet/pet-cor";
	}
	@GetMapping("/pet/pet-cor/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        PetCor c = repository.findById(id);;  
            if (c == null) {
                return "cor-nao-encontrada";
                
            }model.addAttribute("c", c);
             
        return "pet/pet-cor";
	
}}
