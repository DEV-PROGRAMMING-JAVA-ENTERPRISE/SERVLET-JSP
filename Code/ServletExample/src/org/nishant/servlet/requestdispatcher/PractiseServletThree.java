package org.nishant.servlet.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PractiseServletThree
 */
public class PractiseServletThree extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PractiseServletThree() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramOne = request.getParameter("paramOne");
		String paramTwo = request.getParameter("paramTwo");

		String newParam = paramOne + paramTwo;

		PrintWriter out = response.getWriter();

		request.setAttribute("newParam", newParam);

		out.println("From PractiseServletThree newParam is " + newParam);

		RequestDispatcher rd = request
				.getRequestDispatcher("PractiseServletFour");
		rd.include(request, response);
	}

}
