package com.example.demo2.controladores;

import com.example.demo2.entidades.Estudante;
import com.example.demo2.repositorios.EstudanteRepositorio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/estudantes")
@Transactional
public class EstudanteControlador {
    private final EstudanteRepositorio repositorio;


    public EstudanteControlador(EstudanteRepositorio umRepositorio){
        repositorio = umRepositorio;
    }

    @GetMapping
    public List<Estudante> getEstudantes(){

        return repositorio.buscarTodos();
    }

    @GetMapping("/{matricula}")
    public ResponseEntity<Estudante> getEstudantePorMatricula(@PathVariable String matricula){

        Estudante estudante = repositorio.buscarPorMatricula(matricula);

        if(estudante == null){
            return ResponseEntity.notFound().build();
        }else{

            return ResponseEntity.ok(estudante);
        }

    }

    @PostMapping
    public void cadastrar(@RequestBody Estudante umEstudante){

        repositorio.cadastrar(umEstudante);
    }
}
