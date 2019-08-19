package com.example.demo2.entidades;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Collection;
import java.util.Set;

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

    //mapeamento feito cria uma nova tabela no banco onde guarda todos os telefones de um estudante relacionado.
    @ElementCollection
    private Collection<String> telefones;

    @ManyToMany (fetch = FetchType.EAGER)
    private Set <Curso> cursos;

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

    public Collection<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(Collection<String> telefones) {
        this.telefones = telefones;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }


}
