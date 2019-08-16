package com.example.demo2.excecoes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//toda vez que ocorrer essa exceção e for tratada pelo spring mvc, ele deve gerar uma resposta http 404 not found.
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EstudanteNaoEncontradoException extends RuntimeException{
    public EstudanteNaoEncontradoException(){
        super();
    }

    public EstudanteNaoEncontradoException(String message) {
        super(message);
    }

}
