package com.edson.AdoptEasy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edson.AdoptEasy.model.PetCor;

@Controller
public class CorController {
	private static List<PetCor> listaPetCor = new ArrayList<PetCor>();

	public int idCor(PetCor cor) {
		return listaPetCor.size() + 1;
	}

	@PostMapping("/pet/cor")
	public ModelAndView novo(PetCor cor) {
		
		cor.setId(idCor(cor));
		cor.setAtivo(true);
		
		System.out.println(cor.getId());
		ModelAndView mv = new ModelAndView("redirect:../pet/cor");
		if (cor.getCor().length() < 2) {
		} else {
			listaPetCor.add(cor);
		}

		// insert no banco de dados
		mv.addObject("cor", cor);

		return mv;
	}

	@GetMapping("/pet/cor")
	public String list(Model model) {
		model.addAttribute("c",new PetCor());
		model.addAttribute("cor", listaPetCor);
		return "pet/cor";
	}
	
	@GetMapping("/pet/cor/{id}")
	public String detalhe(@PathVariable("id") int id, Model model) {
		for (PetCor c : listaPetCor) {
			if (c.getId() == id) {
				model.addAttribute("c", c);
				break;
			}
		}
		return "pet/cor";
	}
}
