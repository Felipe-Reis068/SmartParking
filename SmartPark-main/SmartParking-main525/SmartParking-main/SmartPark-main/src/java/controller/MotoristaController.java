/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.ArrayList;
import model.Motoristas;
import persistente.Motorista;


public class MotoristaController extends HttpServlet {

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
        processRequest(request, response);
        String nome = request.getParameter("nomeMotorista");
        String todos = request.getParameter("todos");
        String selecionados;
        
        Motoristas motorista1 = new Motoristas("Tomas Edson","(68)98104-2131"); 
        Motoristas motorista2 = new Motoristas("Critian Soares", "(68)99811-4422");
        Motoristas motorista3 = new Motoristas("Janaina Silva", "(68)99211-2102");
        Motoristas motorista4 = new Motoristas("Ronam Calvocante", "(68)98714-4114");
        Motoristas motorista5 = new Motoristas("Rosangela Cristina","(68)98147-5242");
        Motoristas motorista6 = new Motoristas("Raimundo Melo", "(68) 98107-7513");
     
        
        Motorista bdMotorista = new Motorista();
        ArrayList <Motoristas> motoristas = new ArrayList<>();
        motoristas.add(motorista1);
        motoristas.add(motorista2);
        motoristas.add(motorista3);
        motoristas.add(motorista4);
        motoristas.add(motorista5);
        motoristas.add(motorista6);
    
        
        
        if (todos == null)
        {
            selecionados = bdMotorista.buscaNome(motoristas, nome);
        }
        else
        {
            selecionados = bdMotorista.mostrar_motoristas(motoristas);
        }
        
        request.setAttribute("Texto", selecionados);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/MostraMotorista.jsp");
        dispatcher.forward(request, response);
    }

    

}
