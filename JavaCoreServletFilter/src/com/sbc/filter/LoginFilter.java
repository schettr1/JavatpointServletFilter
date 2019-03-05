package com.sbc.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * You can create filter from web.xml or from NEW -> FILTER. 
 * If you create FILTER from NEW, you will get @WebFilter and auto-generated methods
 * @WebFilter(filterName = "LoginFilters", urlPatterns = { "/LoginFilters" }) 
 */

public class LoginFilter implements Filter {


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if(username.equals("user") && password.equals("pass")) {
			
			System.out.println("Username and Password verified in LoginFilter.");

			/* pass the request along the filter chain */
			chain.doFilter(request, response);
		}
		else {
			/* Return login page in response is username or password is invalid */
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
			writer.append("<h3>username is 'user' and password is 'pass'");		
		}
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}
	
}
