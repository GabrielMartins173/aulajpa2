package com.example.demo2.negocio;

import com.example.demo2.entidades.Estudante;
import com.example.demo2.excecoes.EstudanteNaoEncontradoException;
import com.example.demo2.repositorios.CursoRepositorio;
import com.example.demo2.repositorios.EstudanteRepositorio;

public class UniversidadeFachada {

    private EstudanteRepositorio estudantesRepo;
    private CursoRepositorio cursosRepo;

    public UniversidadeFachada(EstudanteRepositorio estudantesRepo, CursoRepositorio cursosRepo){
        this.estudantesRepo = estudantesRepo;
        this.cursosRepo = cursosRepo;
    }

    public void matricular(String matriculaEstudante, String codigoCurso){

        Estudante estudante = estudantesRepo.buscarPorMatricula(matriculaEstudante);

        if(matriculaEstudante == null){
            throw new EstudanteNaoEncontradoException("Numero de matricula invalido");
        }

        
    }
}
