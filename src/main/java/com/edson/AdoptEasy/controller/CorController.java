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

	@PostMapping("/pet/pet-cor")
	public ModelAndView novo(PetCor cor) {

		ModelAndView mv = new ModelAndView("redirect:../pet/pet-cor");
		if (cor.getId() == 0) {
			cor.setId(idCor(cor));

			if (cor.getCor().length() < 2) {
			} else {
				listaPetCor.add(cor);
			}
		} else {
			int i = 0;
			for (PetCor petCor : listaPetCor) {
				if (petCor.getId() == cor.getId()) {
					listaPetCor.set(i, cor);
				}
				i++;
			}
			System.out.println("tentando alterar -> " + cor.getId());
		}
		cor.setAtivo(true);

		System.out.println(cor.getId());

		// insert no banco de dados
		mv.addObject("cor", cor);

		return mv;
	}

	@GetMapping("/pet/pet-cor")
	public String list(Model model) {
		model.addAttribute("c", new PetCor());
		model.addAttribute("cor", listaPetCor);
		return "pet/pet-cor";
	}

	@GetMapping("/pet/pet-cor/{id}")
	public String detalhe(@PathVariable("id") int id, Model model) {
		for (PetCor c : listaPetCor) {
			if (c.getId() == id) {
				model.addAttribute("c", c);
				model.addAttribute("cor", listaPetCor);
				break;
			}
		}
		return "pet/pet-cor";
	}
}
