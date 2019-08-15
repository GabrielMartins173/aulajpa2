package com.example.demo2.controladores;

import com.example.demo2.entidades.Estudante;
import com.example.demo2.repositorios.EstudanteRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudantes")
public class EstudanteControlador {
    private final EstudanteRepositorio repositorio;


    public EstudanteControlador(EstudanteRepositorio umRepositorio){
        repositorio = umRepositorio;
    }

    @GetMapping("/{matricula}")
    public Estudante getEstudantePorMatricula(@PathVariable String matricula){

        return repositorio.buscarPorMatricula(matricula);
    }
}
