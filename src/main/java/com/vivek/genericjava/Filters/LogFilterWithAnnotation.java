package com.vivek.genericjava.Filters;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = {"/*"})
public class LogFilterWithAnnotation implements Filter{
	
	public void init(FilterConfig config) throws ServletException{
		String testParam = config.getInitParameter("test-param");
		System.out.println("Test param: " + testParam);
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String ipAddress = req.getRemoteAddr();
		
		System.out.println("Ip Address: "+ ipAddress + " , Time: " + new Date().toString());
		
		chain.doFilter(req, res);
		
	}
	
	public void destroy(){
		
	}
	
}