package org.example.dao;

import org.example.model.Categoria;

public class CategoriaDAO extends GenericDao<Categoria> {
    public CategoriaDAO() {
        super(Categoria.class); // Passa a classe Categoria para o GenericDao
    }
}
