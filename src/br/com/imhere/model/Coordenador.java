package br.com.imhere.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coordenador extends DefaultEntity<Coordenador> {

    @Id
    private Integer id;

    private String matricula;

    private String nome;

    private String email;


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}