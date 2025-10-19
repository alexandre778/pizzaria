package com.pizzaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // Página inicial
    @GetMapping("/")
    public String home() {
        return "index"; // busca index.html em templates/
    }

    // Página de clientes
    @GetMapping("/clientes")
    public String clientes() {
        return "clientes"; // busca clientes.html em templates/
    }

    // Página de pedidos
    @GetMapping("/pedidos")
    public String pedidos() {
        return "pedidos"; // busca pedidos.html em templates/
    }

    // Página de pedido individual (detalhes ou cadastro)
    @GetMapping("/pedido")
    public String pedido() {
        return "pedido"; // busca pedido.html em templates/
    }
}
