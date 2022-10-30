package com.edson.AdoptEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostagemController {

    @GetMapping("/pet/postagem")
    public String lista() {
        return "pet/postagem-lista";
    }

//    @PostMapping("/pet/postagem")
//    public String lista() {
//        return "pet/postagem-lista";
//    }
    @GetMapping("/pet/postagem-novo")
    public String novo() {
        return "pet/postagem";
    }

    @PostMapping("/pet/postagem-novo")
    public String novo2() {
        return "pet/postagem";
    }

    @GetMapping("/pet/postagem-detalhe")
    public String detalhe() {
        return "pet/postagem-detalhe";
    }

    @PostMapping("/pet/postagem-detalhe")
    public String detalhe2() {
        return "pet/postagem-detalhe";
    }
}
