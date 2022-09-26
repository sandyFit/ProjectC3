package com.co.project_cycle3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/login")
    public String iniciarSesion() {
        return "login";
    }

    @GetMapping("/register")
    public String registrarProductos(Model model) {
        model.addAttribute("welcome", "Bienvenido al sistema");
        return "register_products";
    }
    @GetMapping("/list")
    public String listarProductos() {
        return "products_list";
    }
    
}
