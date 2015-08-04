package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/kontrol")
public class KontrolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sayfa=request.getParameter("sayfa");
		if(sayfa.equals("urunler")){
			 request.getRequestDispatcher("urunler").forward(request, response);
				}
		else if(sayfa.equals("musteriler"))
		{
			request.getRequestDispatcher("musteriler").forward(request, response);
		}else
		{	request.setAttribute("degisken", "abdullah");
			request.getRequestDispatcher("servlet1").forward(request, response);
		
		}
		
	}

}
