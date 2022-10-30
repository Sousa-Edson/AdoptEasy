package com.edson.AdoptEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DetalheAnimalController {

    @GetMapping("/pet/detalhe-animal")
    public String novo() {
        return "pet/detalhe-animal";
    }

    @PostMapping("/pet/detalhe-animal")
    public String home() {
        return "pet/detalhe-animal";
    }
}
