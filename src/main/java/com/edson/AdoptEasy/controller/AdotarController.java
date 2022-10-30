package com.edson.AdoptEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdotarController {

    @GetMapping("/pet/catalogo")
    public String novo() {
        return "pet/catalogo";
    }

    @PostMapping("/pet/catalogo")
    public String home() {
        return "pet/catalogo";
    }
}
