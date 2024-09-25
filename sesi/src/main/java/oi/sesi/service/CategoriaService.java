package oi.sesi.service;

import oi.sesi.model.Categoria;
import java.util.ArrayList;
import java.util.List;

public class CategoriaService {
    private List<Categoria> categorias = new ArrayList<>();

    public void adicionarCategoria(String nome, String descricao) {
        Categoria categoria = new Categoria(nome, descricao);
        categorias.add(categoria);
    }

    public void removerCategoria(String nome) {
     
    }
}
