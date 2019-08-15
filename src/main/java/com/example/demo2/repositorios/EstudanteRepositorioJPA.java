package com.example.demo2.repositorios;

import com.example.demo2.entidades.Estudante;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EstudanteRepositorioJPA implements EstudanteRepositorio {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Estudante> buscarTodos() {
        return null;
    }

    @Override
    public Estudante buscarPorMatricula(String umaMatricula) {
        return em.find(Estudante.class, umaMatricula);
    }

    @Override
    public void cadastrar(Estudante umEstudante) {

    }

    @Override
    public Estudante removerPorMatricula(String umaMatricula) {
        return null;
    }

    @Override
    public void alterar(Estudante umEstudante) {

    }
}
