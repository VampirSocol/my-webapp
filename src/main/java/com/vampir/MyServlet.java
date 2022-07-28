package com.vampir;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		try {
			writer.println("<html><head><body><form action=\"/my-webapp/home/hello\" method=\"POST\">Enter your name: <input name=\"username\" /></form></body></head></html>");
		} finally {
			writer.close();
		}
	}
	
} 