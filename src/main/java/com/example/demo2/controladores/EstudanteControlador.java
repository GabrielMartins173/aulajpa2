package com.example.demo2.controladores;

import com.example.demo2.entidades.Estudante;
import com.example.demo2.excecoes.EstudanteNaoEncontradoException;
import com.example.demo2.repositorios.EstudanteRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
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
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrar(@Valid @RequestBody Estudante umEstudante){

        repositorio.cadastrar(umEstudante);
    }

    @DeleteMapping("/{matricula}")
    public Estudante remover(@PathVariable String matricula){

        return repositorio.removerPorMatricula(matricula);
    }

    @PutMapping("/{matricula}")
    public void alterar (@PathVariable String matricula,
                         @RequestBody Estudante umEstudante){

        Estudante estudante = repositorio.buscarPorMatricula(matricula);

        if(estudante == null){

            throw new EstudanteNaoEncontradoException("Id= " + matricula);
        }

        umEstudante.setMatricula(matricula);

        repositorio.alterar(umEstudante);
    }


}
