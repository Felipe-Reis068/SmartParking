/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;



import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.ArrayList;
import model.Estacionamento;
import model.Motoristas;
import model.Veiculos;
import persistente.Motorista;
import persistente.Veiculo;

public class EstacionamentoController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
   
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        //Como não temos banco de dados, infelizmente tivemos que duplicar codigo
        //Os dados devem se retirados do banco de dados usando as Classes de permanencia. 
        String  texto = "";
        
        Estacionamento vaga1_centro = new Estacionamento(1,1);
        Estacionamento vaga4_nao_centro = new Estacionamento(2,2);
        Estacionamento vaga5_12_horas = new Estacionamento(3,3);
        Estacionamento vaga6_cortesia = new Estacionamento(4,4);
        
        Estacionamento bdEstacionamento = new Estacionamento();
        ArrayList<Estacionamento> estacionamentos = new ArrayList<>();
        estacionamentos.add(vaga1_centro);
        estacionamentos.add(vaga4_nao_centro);
        estacionamentos.add(vaga5_12_horas);
        estacionamentos.add(vaga6_cortesia);
        
        Motorista bdMotorista = new Motorista();
        ArrayList <Motoristas> motoristas = new ArrayList<>();  
        Motoristas motorista1 = new Motoristas("Tomas Edson","(68)98104-2131"); 
        Motoristas motorista2 = new Motoristas("Critian Soares", "(68)99811-4422");
        Motoristas motorista3 = new Motoristas("Janaina Silva", "(68)99211-2102");
        Motoristas motorista4 = new Motoristas("Ronam Calvocante", "(68)98714-4114");
        Motoristas motorista5 = new Motoristas("Rosangela Cristina","(68)98147-5242");
        Motoristas motorista6 = new Motoristas("Raimundo Melo", "(68) 98107-7513");
  
        motoristas.add(motorista1);
        motoristas.add(motorista2);
        motoristas.add(motorista3);
        motoristas.add(motorista4);
        motoristas.add(motorista5);
        motoristas.add(motorista6);
       
        
        Veiculo bdVeiculo = new Veiculo();
        ArrayList <Veiculos> veiculos = new ArrayList<>();
       Veiculos veiculo1 = new Veiculos("MZZ - 2542","Gol ","Branco");
        Veiculos veiculo2 = new Veiculos("BZZ - 2652","Civic City ","Azul");
        Veiculos veiculo3 = new Veiculos("MZN - 4526","HB20 2005","Preto");
        Veiculos veiculo4 = new Veiculos("MNN - 584","TOYOTA ","Cinza");
        Veiculos veiculo5 = new Veiculos("NMN - 5848","CIVC ","Preto");
        Veiculos veiculo6 = new Veiculos("OGG - 5858","HB20 ","Branco");
        
        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);
        veiculos.add(veiculo4);
        veiculos.add(veiculo5);
        veiculos.add(veiculo6);
        
         String busca_por_nome = request.getParameter("busca_por_nome");
        String todos = request.getParameter("todos");
        
        Double valor_tickt_12h = bdEstacionamento._12_horas_especiais_tickets();
        Double valor_tickt_cortesia = bdEstacionamento.cortesia_tickets();
        Double valor_tickt_normal = bdEstacionamento
                .preco_tickt_qualquer_outro_local_estacionado(3.00);
        Double valor_tickt_centro = bdEstacionamento
                .preco_ticket_centro_tempo_estacionado(5.00);
        
        ArrayList <Double> tickts = new ArrayList<>();
        tickts.add(valor_tickt_12h);
        tickts.add(valor_tickt_centro);
        tickts.add(valor_tickt_cortesia);
        tickts.add(valor_tickt_normal);
        
        
        if(todos == null){
            for(int i = 0; i < estacionamentos.size(); i++)
            {
                if (motoristas.get(i).getNome().equals(busca_por_nome))
                {
                    texto += bdMotorista.devolver_motoristas(i, motoristas)
                + bdVeiculo.devolver_veiculo(i, veiculos)
                + bdEstacionamento.devolver_estacionamento(i, estacionamentos)
                + bdEstacionamento.pagar_por_retirada(tickts.get(i));
                    break;
                }
            }
        }else{
            for(int i = 0; i < estacionamentos.size(); i++)
            {
            texto += bdMotorista.devolver_motoristas(i, motoristas)
            + bdVeiculo.devolver_veiculo(i, veiculos)
            + bdEstacionamento.devolver_estacionamento(i, estacionamentos)
            + bdEstacionamento.pagar_por_retirada(tickts.get(i));
            }
        }
        
        
        
        
        request.setAttribute("Texto", texto);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/MostraVagas.jsp");
        dispatcher.forward(request, response);
       
        processRequest(request, response);
    }

}
