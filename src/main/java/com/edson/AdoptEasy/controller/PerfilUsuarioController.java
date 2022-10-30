package com.edson.AdoptEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PerfilUsuarioController {

    @GetMapping("/pet/perfil-pessoa")
    public String novo() {
        return "pet/perfil-pessoa";
    }

    @PostMapping("/pet/perfil-pessoa")
    public String home() {
        return "pet/perfil-pessoa";
    }
}
