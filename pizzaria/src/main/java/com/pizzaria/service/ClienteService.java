package com.pizzaria.service;

import com.pizzaria.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> findAll() {
        return clientes;
    }

    public Cliente findById(Long id) {
        return clientes.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Cliente save(Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }

    public Cliente update(Cliente cliente) {
        delete(cliente.getId());
        clientes.add(cliente);
        return cliente;
    }

    public void delete(Long id) {
        clientes.removeIf(c -> c.getId().equals(id));
    }
}
