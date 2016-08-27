package org.nishant.servlet.requestdispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PractiseServletOne
 */
public class PractiseServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PractiseServletOne() {
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
		String paramThree = request.getParameter("paramThree");

		System.out.println("We only process all the params paramOne "
				+ paramOne + " paramTwo " + paramTwo + " paramThree "
				+ paramThree);

		String newParam = paramOne + paramTwo + paramThree;

		request.setAttribute("newParam", newParam);

		RequestDispatcher rd = request
				.getRequestDispatcher("PractiseServletTwo");
		rd.forward(request, response);
	}
}