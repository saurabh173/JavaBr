package com.servletnjsp.jb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(urlPatterns = {"/SimpleServlet"}, initParams={ @WebInitParam(name = "defaultUser", value="S M")}
			)
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
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
		// TODO Auto-generated method stub

		String name = request.getParameter("userName");
		
		HttpSession session = request.getSession();
		if ((name != "") && (name != null)) {
			session.setAttribute("UsrNameInSession", name);
		}
		
		ServletContext sct= request.getServletContext();
		if ((name != "") && (name != null)) {
			sct.setAttribute("UsrNameInServletContext", name);
		}		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Inside Post menthod name = " + name + ". Name in session = " + session.getAttribute("UsrNameInSession") + ". Name in ServletContext = " + sct.getAttribute("UsrNameInServletContext"));
		out.println(this.getInitParameter("defaultUser"));
	}

}
