package com.edson.AdoptEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DashboardController {
    @GetMapping("/pet/dashboard")
    public String novo() {
        return "pet/dashboard";
    }

    @PostMapping("/pet/dashboard")
    public String home() {
        return "pet/dashboard";
    }
}
