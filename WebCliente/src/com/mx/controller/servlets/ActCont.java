package com.mx.controller.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mx.everis.taller.controller.PersonController;
import com.mx.everis.taller.controller.PersonControllerProxy;

/**
 * Servlet implementation class ActCont
 */
public class ActCont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActCont() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre=request.getParameter("nombre");
		String apellidos=request.getParameter("apellidos");
		String logros=request.getParameter("logros");
		int id=Integer.parseInt(request.getParameter("id"));
		
		PersonController pc=new PersonControllerProxy();
		pc.actPerson(nombre, apellidos, logros, id);
		request.getSession().setAttribute("exito", "registro Exitoso");
		response.sendRedirect("actualizar.jsp");
	}

}
