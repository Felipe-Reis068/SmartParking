package persistente;

import java.util.ArrayList;
import model.Proprietarios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Proprietario {
 
    private String ProprietarioHTML;
    
    public String escolhido(ArrayList <Proprietarios> proprietarios,String cpf)
    {
        ProprietarioHTML = "";
        for (int i=0; i<proprietarios.size();i++){
            if (proprietarios.get(i).getCpf().equals(cpf)){
                ProprietarioHTML = 
                "<p>Nome: " + proprietarios.get(i).getNome() + "<br>"
              + "Contato: " + proprietarios.get(i).getcontato() + "<br>"
              + "CPF: " + proprietarios.get(i).getCpf() + "<br>"
              + "Data de nascimento: " + proprietarios.get(i).getnascimento() + "</p>";
            return ProprietarioHTML;
            }
        }
        return ProprietarioHTML;
    }
    
    public String mostrar_proprietarioss(ArrayList <Proprietarios> proprietarios)
    {
        ProprietarioHTML = "";
        proprietarios.forEach(proprietario -> {
           ProprietarioHTML += 
                "<p>Nome: " + proprietario.getNome() + "<br>"
              + "Contato: " + proprietario.getcontato() + "<br>"
              + "CPF: " + proprietario.getCpf() + "<br>"
              + "Data de nasciment: " + proprietario.getnascimento() + "</p>"
              + "<hr size='1'>";
        });
        
        return ProprietarioHTML;
    }

    public String proprietarios(ArrayList<Proprietarios> proprietarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
