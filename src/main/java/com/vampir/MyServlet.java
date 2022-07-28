package com.vampir;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		try{
			writer.println("<html><head><body><form action=\"/my-webapp/home/hello\" method=\"POST\">Enter your name: <input name=\"username\" /></form></body></head></html>");
		} finally {
			writer.close();
		}
	}

	/*protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String name = req.getParameter("username");
		try{
			writer.println("<html><h1>Hello " + name + "</h1></html>");
		} finally {
			writer.close();
		}
		//req.getSession().setAttribute("String", name);
		//req.getRequestDispatcher("/hello").forward(req, resp);
	}*/
	
} 