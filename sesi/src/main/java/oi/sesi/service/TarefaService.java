package oi.sesi.service;

import oi.sesi.model.Tarefa;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TarefaService {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void criarTarefa(String titulo, String descricao, Date prazo) {
        Tarefa tarefa = new Tarefa(titulo, descricao, prazo);
        tarefas.add(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    public void atualizarTarefa(int id, String novoTitulo) {
        // Lógica para atualizar a tarefa pelo id
    }

    public void excluirTarefa(int id) {
        // Lógica para excluir a tarefa pelo id
    }

	public void adicionarTarefa(Tarefa tarefa) {
		// TODO Auto-generated method stub
		
		
	}
}

