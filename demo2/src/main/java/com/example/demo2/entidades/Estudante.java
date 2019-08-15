package com.example.demo2.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "estudantes")
public class Estudante {

    @Id
    private String matricula;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private int idade;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "[nome = " + getNome() + ", idade = " + getIdade() + ", matricula = " + getMatricula() + "]";
    }
}
