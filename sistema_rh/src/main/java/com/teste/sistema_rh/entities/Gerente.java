package com.teste.sistema_rh.entities;

import com.teste.sistema_rh.interfaces.CalculoSalario;

public class Gerente extends Pessoa {

    public Gerente(int id, String nome, String cpf, String endereco, int dataNascimento, int contato) {
        super(id, nome, cpf, endereco, dataNascimento, contato);
    }
    
}
