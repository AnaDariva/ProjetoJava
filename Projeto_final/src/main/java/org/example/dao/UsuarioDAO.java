package org.example.dao;

import org.example.model.Usuario;

public class UsuarioDAO extends GenericDao<Usuario> {
    public UsuarioDAO() {
        super(Usuario.class); // Passa a classe Usuario para o GenericDao
    }
}
