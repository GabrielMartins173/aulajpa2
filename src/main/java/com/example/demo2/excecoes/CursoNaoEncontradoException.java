package com.example.demo2.excecoes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CursoNaoEncontradoException extends RuntimeException {

    public CursoNaoEncontradoException() {
    }

    public CursoNaoEncontradoException(String message) {
        super(message);
    }
}
