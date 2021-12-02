/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Proprietarios implements java.io.Serializable{
    
    //Dados do proprietário: nome, telefone, cpf e data de nascimento
    
    private String nome;
    private String contato;
    private String cpf;
    private String nascimento;

    public Proprietarios() {
    }

    public Proprietarios(String nome, String contato, String cpf, String nascimento) {
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getcontato() {
        return contato;
    }

    public String getCpf() {
        return cpf;
    }

    public String getnascimento() {
        return nascimento;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setcontato(String contato) {
        this.contato = contato;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setnascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    
    
    
}
