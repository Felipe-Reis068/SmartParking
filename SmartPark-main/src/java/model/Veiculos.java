/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Veiculos implements java.io.Serializable{
  
    private String placa;
    private String modelo;
    private String cor;

    public Veiculos() {
    }

    public Veiculos(String placa, String modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }
    
    

    
}
