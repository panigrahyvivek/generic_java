package com.vivek.genericjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String output;
	
	public void init() throws ServletException{
		output = "Initializing Servlet Variable";
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println(Thread.currentThread().getId());
		out.println(output);
	}
	
	public void destroy() {
		System.out.println("Servlet Destroyed");
	}
}