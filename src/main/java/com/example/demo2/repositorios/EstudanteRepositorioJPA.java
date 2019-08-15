package com.example.demo2.repositorios;

import com.example.demo2.entidades.Estudante;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class EstudanteRepositorioJPA implements EstudanteRepositorio {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Estudante> buscarTodos() {

        //consulta realizada sob o modelo do objeto e não sob o modelo relacional do BD.
        TypedQuery<Estudante> typedQuery = em.createQuery("select e from estudante e", Estudante.class );

        return typedQuery.getResultList();

    }

    @Override
    public Estudante buscarPorMatricula(String umaMatricula) {

        Estudante estudante = em.find(Estudante.class, umaMatricula);

        return estudante;
    }

    @Override
    public void cadastrar(Estudante umEstudante) {

        em.persist(umEstudante);
    }

    @Override
    public Estudante removerPorMatricula(String umaMatricula){
        return null;
    }

    @Override
    public void alterar(Estudante umEstudante) {

    }
}
