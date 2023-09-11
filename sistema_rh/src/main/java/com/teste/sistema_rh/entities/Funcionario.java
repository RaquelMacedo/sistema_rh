package com.teste.sistema_rh.entities;

public  abstract class Funcionario extends Pessoa  {
    String cargo;
    
    public Funcionario(int id, String nome, String cpf, String endereco, int dataNascimento, int contato,
    String cargo) {
        super(id, nome, cpf, endereco, dataNascimento, contato);
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
