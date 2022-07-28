package com.vampir;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String name = req.getParameter("username");
		try{
			writer.println("<html><h1>Hello " + name + "</h1></html>");
		} finally {
			writer.close();
		}
	}

}