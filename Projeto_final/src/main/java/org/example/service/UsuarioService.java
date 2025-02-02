package org.example.service;

import org.example.dao.UsuarioDAO;
import org.example.model.Usuario;
import java.util.List;

public class UsuarioService {

    private final UsuarioDAO usuarioDAO;

    public UsuarioService() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public void cadastrar(Usuario usuario) {
        try {
            usuarioDAO.cadastrar(usuario);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar o usuário.", e);
        }
    }

    public void atualizar(Usuario usuario) {
        try {
            usuarioDAO.atualizar(usuario);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar o usuário.", e);
        }
    }

    public void remover(Long id) {
        try {
            usuarioDAO.remover(id);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao remover o usuário.", e);
        }
    }

    public Usuario buscarPorId(Long id) {
        try {
            return usuarioDAO.buscarPorId(id);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar o usuário por ID.", e);
        }
    }

    public List<Usuario> buscarTodos() {
        try {
            return usuarioDAO.buscarTodos();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar todos os usuários.", e);
        }
    }
}
