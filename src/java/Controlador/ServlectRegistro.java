/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.DAO.*;
import Modelo.Empleado;
import Modelo.Sede;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Jhoan Saavedra
 */
public class ServlectRegistro extends HttpServlet {
    DAO__Empleado daoEmpleado;
    
    @Override
    public void init() throws ServletException {
        try {
            this.daoEmpleado = new DAO__Empleado();
        } catch (SQLException ex) {
            Logger.getLogger(ServlectRegistro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServlectRegistro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ServlectRegistro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ServlectRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
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
         RequestDispatcher rq = request.getRequestDispatcher("Registro.jsp");
        List<Empleado> emp = new ArrayList<>();
        try {
            emp = daoEmpleado.Obtener();
        } catch (SQLException ex) {
            Logger.getLogger(ServlectRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("listaSedes", emp);

        rq.forward(request, response);
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
        if(request.getParameter("buscar")!=null){
            String correo = null;
            
            correo = request.getParameter("correo");
            
            if(correo != null && correo.length()>0){
                try{
                    Empleado empleado = new Empleado();
                    empleado.setCorreo(correo);
                    List<Empleado> empleados = this.daoEmpleado.Obtener();
                    Empleado empleadito = empleados.get(empleados.indexOf(empleado));
                    if(empleadito!=null){
                        //
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            response.sendRedirect("ServlectRegistro");
        }else if(request.getParameter("ingresar")!=null){
            String correo = null, nombre = null, contraseña = null, cargo = null;
            String correoPlanta = null, fechaI = null, fechaF = null, turno = null;
            String sede = null;
            
            correo = request.getParameter("correo");
            nombre = request.getParameter("nombre");
            contraseña = request.getParameter("contrasena");
            cargo = request.getParameter("Cargo_Operador");
            sede = request.getParameter("Sede_Operador");
            // // // // // // //
            correoPlanta = request.getParameter("correoPlanta");
            fechaI = request.getParameter("fechaI");
            fechaF = request.getParameter("fechaF");
            
            if(correo!=null && nombre!=null && contraseña!=null && cargo!=null && correo.length()>0){
                try {
                    Empleado empleado = new Empleado(correo,nombre,contraseña,cargo,new Sede(sede));
                    if(!this.daoEmpleado.Crear(empleado)){
                        System.out.println("Error.");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            response.sendRedirect("ServlectRegistro");
        }else if(request.getParameter("actualizar")!=null){
            String correo = null, nombre = null, contraseña = null, cargo = null;
            String sede = null;
            
            correo = request.getParameter("correo");
            nombre = request.getParameter("nombre");
            contraseña = request.getParameter("contrasena");
            cargo = request.getParameter("Cargo_Operador");
            sede = request.getParameter("Sede_Operador");
            
            if(correo!=null && nombre!=null && contraseña!=null && cargo!=null && correo.length()>0){
                try {
                    Empleado empleado = new Empleado();
                    empleado.setCorreo(correo);
                    List<Empleado> empleados = this.daoEmpleado.Obtener();
                    Empleado empleadito = empleados.get(empleados.indexOf(empleado));
                    if(empleadito!=null){
                        Empleado empleadoE = new Empleado(correo,nombre,contraseña,cargo,new Sede(sede));
                        this.daoEmpleado.Actualizar(empleadoE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ServlectRegistro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{//Eliminar
            String correo = null;
            correo = request.getParameter("correo");
            
            if(correo!=null && correo.length()>0){
                Empleado empleado = new Empleado();
                empleado.setCorreo(correo);
                try {
                    if(!this.daoEmpleado.Eliminar(empleado))
                        System.out.println("Eliminacion incorrecta.");
                } catch (SQLException ex) {
                    Logger.getLogger(ServlectRegistro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
