/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @WillNelson
 * Adapted from https://www.studytonight.com/servlet/servlet-request
 */

package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author willnelson
 */
public class ServletUno extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /**protected void doGet(HttpServletRequest request, HttpServletResponse response)
     *       throws ServletException, IOException{
     *   response.setContentType("text/html;charset=UTF-8");
     *   PrintWriter out = response.getWriter();
     *   try{
     *       out.println("<h2>If you see this the first block of servlet code is working.</h2>");
     *   } finally {
     *       out.close();
     *   }
    *}
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletUno</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUno at " + request.getContextPath() + "</h1>");
            String make = request.getParameter("make");
            String model = request.getParameter("model");
            String year = request.getParameter("year");
            String color = request.getParameter("color");
            out.println("<p>Make: "+ make + "</p>");
            out.println("<p>Model: " + model + "</p>");
            out.println("<p>Year: " + year + "</p>");
            out.println("<p>Color: " + color + "</p>");
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
    /* Commented out for testing, same name as first block.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
*/
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
