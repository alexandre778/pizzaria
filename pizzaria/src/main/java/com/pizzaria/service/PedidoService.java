package com.pizzaria.service;

import com.pizzaria.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    private final List<Pedido> pedidos = new ArrayList<>();

    public List<Pedido> findAll() {
        return pedidos;
    }

    public Pedido findById(Long id) {
        return pedidos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Pedido save(Pedido pedido) {
        pedidos.add(pedido);
        return pedido;
    }

    public Pedido update(Pedido pedido) {
        delete(pedido.getId());
        pedidos.add(pedido);
        return pedido;
    }

    public void delete(Long id) {
        pedidos.removeIf(p -> p.getId().equals(id));
    }
}
