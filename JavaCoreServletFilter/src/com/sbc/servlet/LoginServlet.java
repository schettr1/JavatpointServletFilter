package com.sbc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.append("<p>Welcome to LoginServlet Page.</p>");
		writer.append("<h1>Servlet Filter</h1>");
		writer.append("<p>Filters are used to filter the request from the client before it reaches the Servlet.</p>");
		writer.append("<p>Authentication Filters are used to authenticate login credentials of the client before the client request reaches the servlet.</p>");
		writer.append("<p>When defining 'filter' in web.xml, the url-pattern of the 'filter' must be the same as that of the 'servlet'.</p>");
		writer.append("<i><.servlet-mapping></i><br/>");
		writer.append("<i>&nbsp;&nbsp;&nbsp;<.servlet-name>LoginServlet<./servlet-name></i><br/>");
		writer.append("<i>&nbsp;&nbsp;&nbsp;<.url-pattern>/LoginServlet<./url-pattern></i><br/>");
		writer.append("<i><./servlet-mapping></i><br/><br/>");
		writer.append("<i><.filter-mapping></i><br/>");
		writer.append("<i>&nbsp;&nbsp;&nbsp;<.filter-name>LoginFilter<./filter-name></i><br/>");
		writer.append("<i>&nbsp;&nbsp;&nbsp;<.url-pattern>/LoginServlet<./url-pattern></i><br/>");
		writer.append("<i><./filter-mapping></i><br/>");
		writer.append("");
		writer.append("<p>Filters can only handle Http GET request (no POST request).</p>");
		
		writer.close();
	}	
}
