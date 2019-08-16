package com.example.demo2.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name= "estudantes")
public class Estudante {

    @Id
    @NotBlank
    @NotEmpty
    private String matricula;


    @NotBlank(message = "Nome nao pode estar em branco.")
    @NotEmpty(message = "Nome nao pode estar vazio ou nulo.")
    @Size(min= 2, max = 255, message = "Nome deve ter entre 2 e 255 caracteres.")
    @Column(nullable = false)
    private String nome;

    @Positive(message = "Idade deve ser um numero maior que zero.")
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
