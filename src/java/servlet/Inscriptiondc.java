/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ModCol;
import dao.dataAccess;



/**
 *
 * @author singleton
 */
@WebServlet(name = "Inscriptiondc", urlPatterns = {"/Inscriptiondc"})
public class Inscriptiondc extends HttpServlet {

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
        
        String Statut=(String) request.getParameter("Statut");
        String Prenom=(String) request.getParameter("Prenom");
        String Nom=(String) request.getParameter("Nom");
        String Denomination=(String) request.getParameter("Denomination");
        String Sigle=(String) request.getParameter("Sigle");
        String Tel1=(String) request.getParameter("Tel1");
        String Tel2=(String) request.getParameter("Tel2");
        String LieuResidence=(String) request.getParameter("LieuResidence");
        String Region=(String) request.getParameter("Region");
        String Departement=(String) request.getParameter("Departement");
        String Commune=(String) request.getParameter("Commune");

        
        ModCol ndc = new ModCol(Statut, Prenom, Nom, Denomination, Sigle, Tel1, Tel2, LieuResidence, Region, Departement, Commune );
        dataAccess da = new dataAccess();
        da.addNew(ndc);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Inscriptiondc</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Inscriptiondc at " + request.getContextPath() + "</h1>");
            out.println("<h1>Statut  " + Statut+ "</h1>");
            out.println("</body>");
            out.println("</html>");
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
