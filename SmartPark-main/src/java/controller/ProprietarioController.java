/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.ArrayList;
import model.Proprietarios;
import persistente.Proprietario;


public class ProprietarioController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> methods.
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
            throws ServletException, IOException {
        
        String selecionados;
        String cpf = request.getParameter("cpf");
        String todos = ""; 
        todos += request.getParameter("todos");

        
    Proprietarios proprietario1 = new Proprietarios("Felipe Santos","(68)98107-7452","027.115.182-01", "06/11/2000");
        Proprietarios proprietario2 = new Proprietarios("Arnaldo Melo","(68)9999-5464","252.955.854-02","15/03/1999");
        Proprietarios proprietario3 = new Proprietarios("Rosana Souza","(68)9921-5241","954.581.584-03","04/05/1997");
        Proprietarios proprietario4 = new Proprietarios("Raimundo Brito","(68)98107-8564","257.123.934-04","05/02/2000");
        Proprietarios proprietario5 = new Proprietarios("Aldalberto Santos","(68)96574-7454","254.475.894-05","15/09/1950");
        Proprietarios proprietario6 = new Proprietarios("Silva de Souza","(68)98174-5845","145.854.581-06","25/08/1960");
        ArrayList<Proprietarios> proprietarios = new ArrayList<>();
        
        proprietarios.add(proprietario1);
        proprietarios.add(proprietario2);
        proprietarios.add(proprietario3);
        proprietarios.add(proprietario4);
        proprietarios.add(proprietario5);
        proprietarios.add(proprietario6);
        Proprietario Proprietario = new Proprietario();
        
        if (todos.equals("true")){
            selecionados = Proprietario.proprietarios(proprietarios);
        }else{
            selecionados = Proprietario.escolhido(proprietarios, cpf);
        }
        
        
        request.setAttribute("Texto", selecionados);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/MostraProprietarios.jsp");
        dispatcher.forward(request, response);
    }

}
