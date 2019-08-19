package com.example.demo2.controladores;

import com.example.demo2.entidades.Curso;
import com.example.demo2.repositorios.CursoRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoControlador {

    private CursoRepositorio repositorio;

    public CursoControlador(CursoRepositorio repositorio){
        this.repositorio = repositorio;
    }

    @GetMapping
    public List <Curso> getTodosCursos(){

        return repositorio.buscarTodos();
    }
}
