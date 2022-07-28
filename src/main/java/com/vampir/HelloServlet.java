package com.vampir;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String name = req.getParameter("username");
		try {
			writer.println("<html>");
			writer.println("  <h1>");
			writer.println("    Hello " + name);
			writer.println("  </h1>");
			writer.println("</html>");
		} finally {
			writer.close();
		}
	}

}