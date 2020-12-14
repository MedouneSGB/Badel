/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.dataAccess;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ModInd3;

/**
 *
 * @author HP
 */
public class ServInd3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
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
        
                 String soutien_immediat = (String) request.getParameter("soutien_immediat");
                 String regi_commerce = (String) request.getParameter("regi_commerce");
                 String numero_regi_comm = (String) request.getParameter("numero_regi_comm");
                 String ninea = (String) request.getParameter("ninea");
                 String numero_ninea = (String) request.getParameter("numero_ninea");
                 String reference_prof = (String) request.getParameter("reference_prof");
                 String numero_reference_prof = (String) request.getParameter("numero_reference_prof");
                 String compte_bancaire_sfd = (String) request.getParameter("compte_bancaire_sfd");
                 String nom_banque_sfd = (String) request.getParameter("nom_banque_sfd");
                 String numero_compte_banque_sfd = (String) request.getParameter("numero_compte_banque_sfd");    
                 String soutien_parent = (String) request.getParameter("soutien_parent");
                 String ville_parent = (String) request.getParameter("ville_parent");
                 String pays_parent = (String) request.getParameter("pays_parent"); 
        
        ModInd3 mi3 = new ModInd3(soutien_immediat,regi_commerce,numero_regi_comm,ninea,numero_ninea,reference_prof,numero_reference_prof,compte_bancaire_sfd,nom_banque_sfd,numero_compte_banque_sfd,soutien_parent,ville_parent,pays_parent);
        dataAccess da = new dataAccess();
        da.addModInd3(mi3);
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             RequestDispatcher rd = request.getRequestDispatcher("index.html");
       rd.forward(request, response); 
        }
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    }

   


