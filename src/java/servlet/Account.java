/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controler.HomeControler;
import java.io.IOException;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "account", urlPatterns = {"/account"}, asyncSupported = true)
public class Account extends HttpServlet {

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
        HomeControler data = new HomeControler();
        request.setAttribute("listCategories", data.getListCategories());
       AsyncContext asynContext = request.startAsync(request, response);
       asynContext.dispatch("/signin.jsp");
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
        String button = request.getParameter("button");
        HomeControler data = new HomeControler();
        request.setAttribute("test", data.getListCategories());
        
        switch (button) {
            case "commande":
                request.setAttribute("data", data.getListCategories());
                request.getRequestDispatcher("/listeCommandes.jsp").forward(request, response);
            case "facture" :
                request.setAttribute("data", data.getListCategories());
                request.getRequestDispatcher("/listInvoices.jsp").forward(request, response);
            case "employe": 
                request.setAttribute("data", data.getListCategories());
                request.getRequestDispatcher("/listEmployes.jsp").forward(request, response);
            case "client": 
                request.setAttribute("data", data.getListCategories());
                request.getRequestDispatcher("/listClients.jsp").forward(request, response);
            default:
                doGet(request, response);
        }
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
