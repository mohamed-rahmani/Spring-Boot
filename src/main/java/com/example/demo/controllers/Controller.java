package com.example.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/test")
    public String getTemplate1(Model model) {
        model.addAttribute("name", "Capteur Température");
        return "template1";
    }
}
