/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistente;

import java.util.ArrayList;
import model.Motoristas;

public class Motorista {
    
    private String MotoristaHTML = "";

    public Motorista(String jaimes, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Motorista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    public String mostrar_motoristas(ArrayList <Motoristas> motoristas)
    {
        motoristas.forEach(motorista -> {
            MotoristaHTML = MotoristaHTML +
                    "<p>Nome: " + motorista.getNome() +
                    "<br>Contato: " + motorista.getcontato() +
                    "</p>";
        });
        return MotoristaHTML;
    }

    public String pagar_por_retirada_do_veiculo(String tipoDepagamento, 
                                                Double valor_total)
    {
        return MotoristaHTML = 
                "<h4>NOTA FISCAL</h4><br>" +
                "<p>Total: </p>" + valor_total.toString() +
                "<p>Pagamento em: " + tipoDepagamento +
                "<p>-------------------</p>";
                
    }
    
    public String buscaNome(ArrayList <Motoristas> motoristas, String nome){
        motoristas.forEach(motorista -> {
            if(nome.toLowerCase().equals(motorista.getNome().toLowerCase())){
                MotoristaHTML = MotoristaHTML +
                    "<p>Nome: " + motorista.getNome() +
                    "<br>Contato: " + motorista.getcontato() +
                    "</p>";
            }
        });
        return MotoristaHTML;
    }
    
    public String devolver_motoristas(int index, ArrayList <Motoristas> motorista)
    {
        return  MotoristaHTML =
                "<p>Nome: " + motorista.get(index).getNome() +
                "<br>Contato: " + motorista.get(index).
                                                                getcontato() +
                "</p>";
    }
}
