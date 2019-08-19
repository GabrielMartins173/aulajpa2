package com.example.demo2.repositorios;

import com.example.demo2.entidades.Curso;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class CursoRepositorioJPA implements CursoRepositorio{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Curso> buscarTodos() {

        TypedQuery<Curso> consulta = em.createQuery(
                "select c from Curso c",
                Curso.class
        );

        return consulta.getResultList();


    }

    @Override
    public Curso buscarPorCodigo(String codigo) {
        return em.find(Curso.class, codigo);
    }
}
