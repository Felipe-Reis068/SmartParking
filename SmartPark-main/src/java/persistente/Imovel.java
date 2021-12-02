/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistente;

import java.util.ArrayList;
import model.Imoveis;


public class Imovel {
    
   
    
    public ArrayList <Imoveis> Bairro(String bairro, ArrayList <Imoveis> imoveis){
        ArrayList <Imoveis> guardaImoveis = new ArrayList<>();
        for(int i=0;i<imoveis.size();i++){
            Imoveis cadaImovel = imoveis.get(i);
            if (cadaImovel.getEndereco().getBairro().toLowerCase().equals(bairro.toLowerCase())){
                guardaImoveis.add(cadaImovel);
            }
        }
        return guardaImoveis;
    }
    public ArrayList <Imoveis> Registro(String registro, ArrayList <Imoveis> imoveis){
        ArrayList <Imoveis> guardaImoveis = new ArrayList<>();
        for(int i=0;i<imoveis.size();i++){
            Imoveis cadaImovel = imoveis.get(i);
            if (cadaImovel.getMatricula().equals(registro)){
                guardaImoveis.add(cadaImovel);
            }
        }
        return guardaImoveis;
    }
    
    public String exibeInfo(ArrayList <Imoveis> selecionados){
        String htmlText = "";
        for(int i=0;i<selecionados.size();i++){
            htmlText = htmlText + "<h4>Endereco</h4>"
            + "<p>CEP: " + selecionados.get(i).getEndereco().getCep() + "<br>"
            + "Pais: "+selecionados.get(i).getEndereco().getPais() +"<br>"
            + "Estado: "+selecionados.get(i).getEndereco().getEstado()+"<br>"
            + "Cidade: "+selecionados.get(i).getEndereco().getCidade()+"<br>"
            + "Bairro: "+selecionados.get(i).getEndereco().getBairro()+"<br>"
            + "Rua: "+selecionados.get(i).getEndereco().getRua()+"</p>"
            + "<h4>Informaçoes</h4>"
            + "<p>Matricula: "+ selecionados.get(i).getMatricula()+"<br>"
            + "Tamanho do Terreno: "+ selecionados.get(i).getTamanho()+"<br>"
            + "Geolocalização: "+ selecionados.get(i).getGeolocalizacao() + "<br>"
            + "Aluguel: "+ selecionados.get(i).getalugel().toString()+ "<br>"
            + "Data alugação: "+selecionados.get(i).getdata() + "</p><br>"
            + "<hr size='1'>";
        }
        return htmlText;
    }
    
}
