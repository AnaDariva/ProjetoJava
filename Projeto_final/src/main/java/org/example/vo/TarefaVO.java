package org.example.vo;

import java.time.LocalDate;

public class TarefaVO {

    private final String nome;
    private final String descricao;
    private final LocalDate dataCriacao;
    private final String categoriaNome;

    public TarefaVO(String nome, String descricao, LocalDate dataCriacao, String categoriaNome) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.categoriaNome = categoriaNome;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public String getCategoriaNome() {
        return categoriaNome;
    }
}
