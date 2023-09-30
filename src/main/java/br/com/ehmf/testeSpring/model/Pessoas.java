package br.com.ehmf.testeSpring.model;

import java.util.Objects;

public class Pessoas {
    private int id;
    private String nome;
    private String email;

    public Pessoas() {}
    public Pessoas(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoas pessoas = (Pessoas) o;
        return id == pessoas.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
