package com.edson.AdoptEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @GetMapping("/pet/register")
    public String novo() {
        return "pet/cadastroUsu";
    }

    @PostMapping("/pet/register")
    public String home() {
        return "pet/cadastroUsu";
    }
}
