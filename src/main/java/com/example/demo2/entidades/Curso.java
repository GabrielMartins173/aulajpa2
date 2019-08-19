package com.example.demo2.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "cursos")

public class Curso {

    @Id // Indicação de chave primária para o BD
    @NotEmpty // validador de dados de entrada
    @NotBlank // validador de dados de entrada
    @Column (nullable = false) // referente ao BD
    private String codigo;

    @Column(nullable = false) //referente ao BD
    @NotBlank // validador de dados de entrada
    @NotEmpty // validador de dados de entrada
    private String nome;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
