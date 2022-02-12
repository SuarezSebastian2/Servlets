/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SEBASTIAN
 */
public class Servlet1 extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String Producto = request.getParameter("nameP");
            double Precio = Double.parseDouble(request.getParameter("productoPrecio"));
            double Iva = Precio * 19/100;
            double PrecioTotal = Iva+Precio;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div style='background-color: cyan;margin-top: 16%;padding-top: 3px;margin-left: 16%;margin-right: 16%;border-radius: 3%; border: 5px solid chartreuse'>"+
                            "<h3 style='font-size: 200%; margin-left: 16%; margin-top: 2%;margin-right: 16%; padding-bottom: 20px;margin-bottom: 20px;font-family:monospace;'> "
                                + "El precio del producto "
                                +"<span style=' color:green; background-color:white; border:solid; border-color:black'>"+Producto+"</span>"+" sin iva es $"
                                +"<span style=' color:green; background-color:white; border:solid; border-color:black'>"+Precio+"</span>"+"<br>"
                                +" su correspondiente iva del 19% es $"
                                +"<span style=' color:green; background-color:white; border:solid; border-color:black'>"+Iva+"</span>"+"<br>"
                                +" y el precio total es $"
                                +"<span style=' color:green; background-color:white; border:solid; border-color:black'>"+PrecioTotal+"</span>"+"</h3>"+"</div>");
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
