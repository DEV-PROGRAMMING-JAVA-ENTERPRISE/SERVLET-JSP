package org.nishant.servlet.listeners;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PractiseServlet
 */
public class PractiseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PractiseServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Admin admin = (Admin) getServletContext().getAttribute("admin");

		PrintWriter out = response.getWriter();

		out.println("Hiiiiiiiiiiiii from "
				+ getServletContext().getServerInfo());

		out.println("Admin object is");
		out.println(admin);
	}
}