package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.example.exception.DataAccessException;
import org.example.util.JPAUtil;
import java.util.List;

public abstract class GenericDao<T> {

    private final Class<T> entityClass;

    public GenericDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected EntityManager getEntityManager() {
        return JPAUtil.getEntityManager();
    }

    public void cadastrar(T entity) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(entity);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw new DataAccessException("Erro ao cadastrar a entidade: " + entity.getClass().getSimpleName(), e);
        } finally {
            em.close();
        }
    }

    public void atualizar(T entity) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(entity);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw new DataAccessException("Erro ao atualizar a entidade: " + entity.getClass().getSimpleName(), e);
        } finally {
            em.close();
        }
    }

    public void remover(Long id) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            T entity = em.find(entityClass, id);
            if (entity != null) {
                em.remove(entity);
            }
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw new DataAccessException("Erro ao remover a entidade: " + entityClass.getSimpleName(), e);
        } finally {
            em.close();
        }
    }

    public T buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(entityClass, id);
        } catch (Exception e) {
            throw new DataAccessException("Erro ao buscar o id: " + id + " da entidade: " + entityClass.getSimpleName(), e);
        } finally {
            em.close();
        }
    }

    public List<T> buscarTodos() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("FROM " + entityClass.getSimpleName(), entityClass).getResultList();
        } catch (Exception e) {
            throw new DataAccessException("Erro ao buscar todos de: " + entityClass.getSimpleName(), e);
        } finally {
            em.close();
        }
    }
}
