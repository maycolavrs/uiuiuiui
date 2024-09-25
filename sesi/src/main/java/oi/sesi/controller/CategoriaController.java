package oi.sesi.controller;

import oi.sesi.service.CategoriaService;

public class CategoriaController {
    private CategoriaService categoriaService = new CategoriaService();

    public void adicionarCategoria(String nome, String descricao) {
        categoriaService.adicionarCategoria(nome, descricao);
    }

    public void removerCategoria(String nome) {
        categoriaService.removerCategoria(nome);
    }
}
