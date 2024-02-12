package com.example.ecommerce.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"", "/", "/home"}) // dostep do strony glownej z /, , /home
    public String displayHomePage(Model model) {

        model.addAttribute("username", "Aleksander");
        return "home.html";
    }



}
