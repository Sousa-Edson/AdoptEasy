package com.edson.AdoptEasy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edson.AdoptEasy.model.PetRaca;

@Controller
public class RacaController {
    private static List<PetRaca> listaPetRaca = new ArrayList<PetRaca>();

    public void carregar() {
        if (listaPetRaca.size() < 1) {
            listaPetRaca.add(new PetRaca(1, "Dachshund", true));
            listaPetRaca.add(new PetRaca(2, "Labrador retriever", true));
            listaPetRaca.add(new PetRaca(3, "Buldogue francês", true));
            listaPetRaca.add(new PetRaca(4, "Pastor-alemão", true));
        }
    }

    public int idraca(PetRaca raca) {
        return listaPetRaca.size() + 1;
    }

    @PostMapping("/pet/pet-raca")
    public ModelAndView novo(PetRaca raca) {

        ModelAndView mv = new ModelAndView("redirect:../pet/pet-raca");
        if (raca.getId() == 0) {
            raca.setId(idraca(raca));

            if (raca.getRaca().length() < 2) {
            } else {
                listaPetRaca.add(raca);
            }
        } else {
            int i = 0;
            for (PetRaca PetRaca : listaPetRaca) {
                if (PetRaca.getId() == raca.getId()) {
                    listaPetRaca.set(i, raca);
                }
                i++;
            }
            System.out.println("tentando alterar -> " + raca.getId());
        }
        raca.setAtivo(true);

        System.out.println(raca.getId());

        // insert no banco de dados
        mv.addObject("raca", raca);

        return mv;
    }

    @GetMapping("/pet/pet-raca")
    public String list(Model model) {
        carregar();
        model.addAttribute("c", new PetRaca());
        model.addAttribute("raca", listaPetRaca);
        return "pet/pet-raca";
    }

    @GetMapping("/pet/pet-raca/{id}")
    public String detalhe(@PathVariable("id") int id, Model model) {
        for (PetRaca c : listaPetRaca) {
            if (c.getId() == id) {
                model.addAttribute("c", c);
                model.addAttribute("raca", listaPetRaca);
                break;
            }
        }
        return "pet/pet-raca";
    }
}
