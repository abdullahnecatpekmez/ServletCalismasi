package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/merhaba")
public class MerhabaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		PrintWriter yazici=response.getWriter();
		String ad=request.getParameter("ad");
		String soyad=request.getParameter("soyad");
        System.out.println(ad);
        System.out.println(soyad);
		yazici.write("<h2>Merhaba"+ad+soyad+"</h2>");
		yazici.flush();
	}

}
