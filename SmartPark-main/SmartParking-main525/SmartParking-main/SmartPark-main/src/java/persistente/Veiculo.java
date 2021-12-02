/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistente;

import java.util.ArrayList;
import model.Veiculos;


public class Veiculo {

    private String veiculosHTML = "";
    
 

    public String todos_veiculos(ArrayList<Veiculos> veiculos) {
        veiculos.forEach(veiculo -> {
            veiculosHTML = veiculosHTML
                    + "<p>Placa: " + veiculo.getPlaca()
                    + "<br>Modelo: " + veiculo.getmodelo()
                    + "<br>Cor: " + veiculo.getCor() + "</p><hr size='1'>";
        });
        return veiculosHTML;
    }
    
    
    
    public String modelo (ArrayList<Veiculos> veiculos, String modelo) {
        veiculos.forEach(veiculo -> {
            if (modelo.equals(veiculo.getmodelo())) {
                veiculosHTML = veiculosHTML
                        + "<p>Placa: " + veiculo.getPlaca()
                        + "<br>Modelo: " + veiculo.getmodelo()
                        + "<br>Cor: " + veiculo.getCor() + "</p><hr size='1'>";
            }
        });
        return veiculosHTML;
    }
    
    
 
     public String Placa(ArrayList<Veiculos> veiculos, String placa) {
        veiculos.forEach(veiculo -> {
            if (placa.equals(veiculo.getPlaca())) {
                veiculosHTML = veiculosHTML
                        + "<p>Placa: " + veiculo.getPlaca()
                        + "<br>Modelo: " + veiculo.getmodelo()
                        + "<br>Cor: " + veiculo.getCor() + "</p><hr size='1'>";
            }
        });
        return veiculosHTML;
    }


    public String dados(int index, ArrayList<Veiculos> veiculo) {
        return veiculosHTML
                = "<p>Placa: " + veiculo.get(index).getPlaca()
                + "<br>Modelo: " + veiculo.get(index).getmodelo()
                + "<br>Cor: " + veiculo.get(index).getCor() + "</p>";

    }
}
