package oi.sesi.controller;

import oi.sesi.model.Tarefa;
import oi.sesi.service.TarefaService;

import java.util.Date;

public class TarefaController {
    private TarefaService tarefaService = new TarefaService();

    public void criarNovaTarefa(String titulo, String descricao) {
        Tarefa tarefa = new Tarefa(titulo, descricao, new Date());
        tarefaService.adicionarTarefa(tarefa);
        System.out.println("Tarefa criada: " + tarefa.getTitulo());
    }
}
