package com.company.beans;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final int idUsuario;
    private int idade;
    private String nome;
    private List<String> interesses;
    private OrigemUsuario origem;
    private String email;

    public Usuario(int idUsuario, int idade, String nome, List<String> interesses, OrigemUsuario origem, String email) {
        this.idUsuario = idUsuario;
        this.setIdade(idade);
        this.setNome(nome);
        this.setInteresses(interesses == null ? new ArrayList<>() : interesses);
        this.setOrigem(origem);
        this.setEmail(email);
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
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

    public OrigemUsuario getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemUsuario origem) {
        this.origem = origem;
    }

    public List<String> getInteresses() {
        return interesses;
    }

    public void setInteresses(List<String> interesses) {
        this.interesses = interesses;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
}
