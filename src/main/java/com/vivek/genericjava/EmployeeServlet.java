package com.vivek.genericjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.vivek.genericjava.Models.Employee;
import com.vivek.genericjava.util.JsonConverter;

public class EmployeeServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String output;
	
	public void init() throws ServletException{
		output = "Initializing Servlet Variable";
		
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		//res.setContentType("application/json;charset=UTF-8");
		res.setContentType("text/plain;charset=UTF-8");
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("I077837", "Vivek"));
		employees.add(new Employee("I077838", "Priya"));
		
		//
		//JsonArray jarray = gson.toJsonTree(employees).getAsJsonArray();
        //JsonObject jsonObject = new JsonObject();
        //jsonObject.add("output", jarray);
        
		//JsonConverter converter = new JsonConverter();
		//String output = converter.convertToJson(employees);
		
		
		
		ServletOutputStream out = res.getOutputStream();
		out.print(employees.toString());
		
		
		
		
		
		
	}
	
	public void destroy() {
		System.out.println("Servlet Destroyed");
	}
}