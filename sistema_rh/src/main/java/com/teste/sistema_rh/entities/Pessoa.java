package com.teste.sistema_rh.entities;

public abstract class Pessoa {
    int id;
    String nome; 
    String cpf;
    String endereco;
    int dataNascimento; 
    int contato;
    
    public Pessoa(int id, String nome, String cpf, String endereco, int dataNascimento, int contato) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getContato() {
        return contato;
    }
    public void setContato(int contato) {
        this.contato = contato;
    }
}
