package com.edson.AdoptEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DoarController {

    @GetMapping("/pet/cadastroAnimal")
    public String novo() {
        return "pet/cadastroAnimal";
    }

    @PostMapping("/pet/cadastroAnimal")
    public String home() {
        return "pet/cadastroAnimal";
    }
}
