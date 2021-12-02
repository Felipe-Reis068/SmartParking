/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;


import persistente.Imovel;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.util.ArrayList;
import model.Ender;
import model.Imoveis;




@WebServlet(name = "ImovelController", urlPatterns = {"/ImovelController"})
public class ImovelController extends HttpServlet {

   

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
        String bairro = request.getParameter("bairro");
        String registro = request.getParameter("registro");
        String todos = request.getParameter("todos");
        
      
        ArrayList <Imoveis> imoveis = new ArrayList<>();
        
        Ender centro = new Ender("69915-126","Brasil","Acre","Rio Branco", "Centro", "Edimar Lagislau","1250");
        Ender semCentro = new Ender("6918-032","Brasil", "Acre", "Rio Branco", "Universitario ","Adalberto Pinho","323");
        Imoveis imo = new Imoveis(centro, "20-001/C","10x20", "-1432165532 +144654622", 1000.00, "01/12/20");
        Imoveis imo1 = new Imoveis(semCentro, "21-001/U", "1000x150","-115656532 -11457878711", 1200.00, "13/02/21");
        Imoveis imo2 = new Imoveis(centro,"20-002/C","70x60","-556232165564 +504654656", 2500.00, "06/10/17");
        Imoveis imo3 = new Imoveis(semCentro, "21-002/U", "50x150","-125656532 -12457878711", 600.00, "12/01/21");
        Imoveis imo4 = new Imoveis(centro,"20-003/C","70x60","-136232165564 +134654656", 5000.00, "12/11/20");
        Imoveis imo5 = new Imoveis(semCentro, "21-003/U", "200x150","-135656532 -13457878711", 500.00, "10/01/21");

    
     
        imoveis.add(imo);
        imoveis.add(imo1);
        imoveis.add(imo2);
        imoveis.add(imo3);
        imoveis.add(imo4);
        imoveis.add(imo5);
     
                
        
        
        
        Imovel bancoImovel = new Imovel();
        
        if (todos == null){
            if(registro == null){
                selecionados = bancoImovel.exibeInfo(bancoImovel.Bairro(bairro,imoveis));
            }else{
                selecionados = bancoImovel.exibeInfo(bancoImovel.Registro(registro,imoveis));
            }
        }else{
            selecionados = bancoImovel.exibeInfo(imoveis);  
        }
   
        request.setAttribute("Texto", selecionados);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/MostraImovel.jsp");
        dispatcher.forward(request, response);
    }
}
