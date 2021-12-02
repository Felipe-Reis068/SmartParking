/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.ArrayList;
import model.Veiculos;
import persistente.Veiculo;

public class VeiculoController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        String veiculo = request.getParameter("placa");
        String modelo = request.getParameter("modelo");
        String todos_veiculos = request.getParameter("todos");
        String dados;
        
  
        
        Veiculos veiculo1 = new Veiculos("MZZ - 2542","Gol ","Branco");
        Veiculos veiculo2 = new Veiculos("BZZ - 2652","Civic City 2021","Azul");
        Veiculos veiculo3 = new Veiculos("MZN - 4526","HB20 ","Preto");
        Veiculos veiculo4 = new Veiculos("MNN - 584","TOYOTA ","Cinza");
        Veiculos veiculo5 = new Veiculos("NMN - 5848","CIVC ","Preto");
        Veiculos veiculo6 = new Veiculos("OGG - 5858","HB20 ","Branco");
        
        
       
        
        Veiculo Veiculo = new Veiculo();
        ArrayList <Veiculos> veiculos = new ArrayList<>();
        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);
        veiculos.add(veiculo4);
        veiculos.add(veiculo5);
        veiculos.add(veiculo6);
        
       
        
        if(todos_veiculos == null)
        {
            if(veiculo == null)
            {
                dados = 
                        Veiculo.modelo(veiculos,modelo);
            }
            else
                dados = 
                          Veiculo.Placa(veiculos,veiculo);
        }
        else
        {
            dados = 
                                   Veiculo.todos_veiculos(veiculos);
        }
        
        request.setAttribute("Texto", dados);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/MostraProprietarios.jsp");
        dispatcher.forward(request, response);
        
        
    }

}
