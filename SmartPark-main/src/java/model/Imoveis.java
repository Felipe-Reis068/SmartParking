/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Imoveis{
    
    private Ender endereco;
    private String matricula;
    private String tamanho;
    private String geolocalizacao;
    private Double alugel;
    private String data;

    public Imoveis() {
    }

    
    public Imoveis(Ender endereco, String matricula, 
                  String tamanho, String geolocalizacao, 
                  Double alugel, String data) {
        this.endereco = endereco;
        this.matricula = matricula;
        this.tamanho = tamanho;
        this.geolocalizacao = geolocalizacao;
        this.alugel = alugel;
        this.data = data;
    }

    public Ender getEndereco() {
        return endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getGeolocalizacao() {
        return geolocalizacao;
    }

    public Double getalugel() {
        return alugel;
    }

    public String getdata() {
        return data;
    }

    public void setEndereco(Ender endereco) {
        this.endereco = endereco;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setGeolocalizacao(String geolocalizacao) {
        this.geolocalizacao = geolocalizacao;
    }

    public void setalugel(Double alugel) {
        this.alugel = alugel;
    }

    public void setdata(String data) {
        this.data = data;
    }
    
    
}
