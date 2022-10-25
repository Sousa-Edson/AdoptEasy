package com.edson.AdoptEasy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edson.AdoptEasy.model.PetCor;

@Controller
public class PetCorController {
	private static List<PetCor> listaPet = new ArrayList<PetCor>();

//
//	@GetMapping("/pet/cor")
//	public String cor() {
//		return "pet/cor";
//	}
//	
	public int idCor(PetCor cor) {
		
		return cor.getId()+1;
	}

	@PostMapping("/pet/cor")	
	public ModelAndView novo(PetCor cor) {
		cor.setId(idCor(cor));
		System.out.println(cor.getId());
		ModelAndView mv = new ModelAndView("redirect:../pet/cor");
		if (cor.getCor().length() < 2) {
		} else {
			listaPet.add(cor);
		}

		// insert no banco de dados
		mv.addObject("cor", cor);

		return mv;
	}

	@GetMapping("/pet/cor")
	public String list(Model model) {
		model.addAttribute("cor", listaPet);
		return "pet/cor";
	}
}
