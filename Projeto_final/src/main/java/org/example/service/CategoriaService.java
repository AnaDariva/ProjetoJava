package org.example.service;

import org.example.dao.CategoriaDAO;
import org.example.model.Categoria;
import java.util.List;

public class CategoriaService {

    private final CategoriaDAO categoriaDAO;

    public CategoriaService() {
        this.categoriaDAO = new CategoriaDAO();
    }

    public void cadastrar(Categoria categoria) {
        try {
            categoriaDAO.cadastrar(categoria);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar a categoria.", e);
        }
    }

    public void atualizar(Categoria categoria) {
        try {
            categoriaDAO.atualizar(categoria);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a categoria.", e);
        }
    }

    public void remover(Long id) {
        try {
            categoriaDAO.remover(id);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao remover a categoria.", e);
        }
    }

    public Categoria buscarPorId(Long id) {
        try {
            return categoriaDAO.buscarPorId(id);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar a categoria por ID.", e);
        }
    }

    public List<Categoria> buscarTodos() {
        try {
            return categoriaDAO.buscarTodos();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar todas as categorias.", e);
        }
    }
}
