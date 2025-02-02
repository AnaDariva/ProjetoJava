package org.example.dao;

import org.example.model.Tarefa;

public class TarefaDAO extends GenericDao<Tarefa> {
    public TarefaDAO() {
        super(Tarefa.class); // Passa a classe Tarefa para o GenericDao
    }
}
