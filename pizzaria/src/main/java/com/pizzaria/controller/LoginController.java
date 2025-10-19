package com.pizzaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        // Retorna a view login.html
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {

        // Usuário demo: admin / 123
        if ("admin".equals(username) && "123".equals(password)) {
            // login bem-sucedido, redireciona para página inicial
            return "redirect:/home";
        } else {
            // login falhou, exibe mensagem de erro
            model.addAttribute("loginError", "Usuário ou senha inválidos!");
            return "login"; // permanece na view login.html
        }
    }

    @GetMapping("/home")
    public String homePage() {
        return "home"; // você precisa criar home.html
    }
}
