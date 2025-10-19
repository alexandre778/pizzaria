package com.pizzaria.service;

import com.pizzaria.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private final List<Produto> produtos = new ArrayList<>();

    public List<Produto> findAll() {
        return produtos;
    }

    public Produto findById(Long id) {
        return produtos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Produto save(Produto produto) {
        produtos.add(produto);
        return produto;
    }

    public Produto update(Produto produto) {
        delete(produto.getId());
        produtos.add(produto);
        return produto;
    }

    public void delete(Long id) {
        produtos.removeIf(p -> p.getId().equals(id));
    }
}

