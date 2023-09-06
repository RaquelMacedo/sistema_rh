package com.teste.sistema_rh.entities;

import com.teste.sistema_rh.enums.TipoFuncionario;

public  abstract class Funcionario extends Pessoa  {
    TipoFuncionario cargo;

    public Funcionario(int id, String nome, String cpf, String endereco, int dataNascimento, int contato,
            String atendente, String supervisor, String gerente) {
        super(id, nome, cpf, endereco, dataNascimento, contato);
        Atendente = atendente;
        Supervisor = supervisor;
        Gerente = gerente;
    }
    public String getAtendente() {
        return Atendente;
    }
    public void setAtendente(String atendente) {
        Atendente = atendente;
    }
    public String getSupervisor() {
        return Supervisor;
    }
    public void setSupervisor(String supervisor) {
        Supervisor = supervisor;
    }
    public String getGerente() {
        return Gerente;
    }
    public void setGerente(String gerente) {
        Gerente = gerente;
    }
}
