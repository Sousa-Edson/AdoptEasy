package com.edson.AdoptEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CatalogoController {

    @GetMapping("/pet/intencao-adotar")
    public String novo() {
        return "pet/intencao-adotar";
    }

    @PostMapping("/pet/intencao-adotar")
    public String home() {
        return "pet/intencao-adotar";
    }
}
