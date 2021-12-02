/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Motoristas implements java.io.Serializable{
    private String nome;
    private String contato;

    public Motoristas() {
    }

    
    public Motoristas(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getcontato() {
        return contato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setcontato(String contato) {
        this.contato = contato;
    }
    
    
    
}
