/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lasha
 */
@WebServlet(urlPatterns = {"/FruitBox"})
public class FruitBox extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FruitBox</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FruitBox at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
          PrintWriter out = response.getWriter();
        
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fruitbox","root","");
//            Statement statement = con.createStatement();
//        }catch(Exception e){
//        }
        Enumeration<String> parameterNames = request.getParameterNames();
//        while (parameterNames.hasMoreElements()) {
//        //String paramName = parameterNames.nextElement();
//        //out.write(paramName);
//        //out.write("n");
//        // String[] paramValues = request.getParameterValues(paramName);
//         for (int i = 0; i < paramValues.length; i++) {
//             String paramValue = paramValues[i];
//             out.write("t" + paramValue);
//             out.write("n");
//         }
//        }
        String data = request.getParameter("temperature");
        Logger.getGlobal().log(Level.INFO, data);
        out.write("t" + data);
        out.write("n");
        out.close();
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
        //processRequest(request, response);
         String data = request.getParameter("data");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        System.out.println(data);
        //out.println(data);
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
