package org.example.service;

import org.example.dao.TarefaDAO;
import org.example.model.Tarefa;
import java.util.List;

public class TarefaService {

    private final TarefaDAO tarefaDAO;

    public TarefaService() {
        this.tarefaDAO = new TarefaDAO();
    }

    public void cadastrar(Tarefa tarefa) {
        try {
            tarefaDAO.cadastrar(tarefa);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar a tarefa.", e);
        }
    }

    public void atualizar(Tarefa tarefa) {
        try {
            tarefaDAO.atualizar(tarefa);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a tarefa.", e);
        }
    }

    public void remover(Long id) {
        try {
            tarefaDAO.remover(id);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao remover a tarefa.", e);
        }
    }

    public Tarefa buscarPorId(Long id) {
        try {
            return tarefaDAO.buscarPorId(id);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar a tarefa por ID.", e);
        }
    }

    public List<Tarefa> buscarTodos() {
        try {
            return tarefaDAO.buscarTodos();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar todas as tarefas.", e);
        }
    }
}
