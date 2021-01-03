/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.dataAccess;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ModCol1;

/**
 *
 * @author user
 */
public class UpdateCol1 extends HttpServlet {

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
        response.setContentType("text/html;charset=ISO-8859-1");

        
        String typeAction = (String) request.getParameter("type1");
        
        String titre = (String) request.getParameter("titre");
        String nat_juridique = (String) request.getParameter("nat_juridique");
        String denomination = (String) request.getParameter("denomination");
        String reconnaisance_juridique = (String) request.getParameter("reconnaisance_juridique");
        String pays = (String) request.getParameter("pays");
        String region = (String) request.getParameter("region");
        String departement = (String) request.getParameter("departement");
        String commune = (String) request.getParameter("commune");
        String hors_senegal = (String) request.getParameter("hors_senegal");
        String date_creation = (String) request.getParameter("date_creation");
        String total_membre = (String) request.getParameter("total_membre");
        String total_homme = (String) request.getParameter("total_homme");
        String total_femme = (String) request.getParameter("total_femme");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String formulaire_id = "Form" + timestamp.getTime();

        ModCol1 mc1 = new ModCol1(formulaire_id, titre, nat_juridique, denomination, reconnaisance_juridique, pays, region, departement, commune, hors_senegal, date_creation, total_membre, total_homme, total_femme);
        dataAccess da = new dataAccess();
        da.updateInd1(mc1);

        String idx = (String) request.getParameter("id");
        request.setAttribute("idx", idx);
        request.setAttribute("formulaire_id", formulaire_id);
        if(typeAction != null){
        RequestDispatcher rd = request.getRequestDispatcher("inscriptionCollective2.jsp");
        rd.forward(request, response);
        }else{
        RequestDispatcher rd = request.getRequestDispatcher("Principal.jsp");
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
