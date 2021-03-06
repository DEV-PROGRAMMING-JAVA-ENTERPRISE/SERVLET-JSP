package org.nishant.servlet.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PractiseServletFour
 */
public class PractiseServletFour extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PractiseServletFour() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String newParam = (String) request.getAttribute("newParam");

		PrintWriter out = response.getWriter();

		out.println("From PractiseServletFour newParam is " + newParam);

		newParam = newParam + "_modification";

		out.println("After modification newParam is " + newParam);
	}
}