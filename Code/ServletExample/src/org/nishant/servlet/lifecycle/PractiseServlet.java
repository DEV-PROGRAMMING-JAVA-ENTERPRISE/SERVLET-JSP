package org.nishant.servlet.lifecycle;

import java.io.IOException;
import javax.servlet.ServletConfig;
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
		System.out.println("PractiseServlet default constructor has called");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

		System.out
				.println("PractiseServlet init method has called, ServletConfig "
						+ config);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("PractiseServlet doGet method has called");
	}

	/**
	 * issue is how to get called destroy method
	 */
	public void destroy() {
		System.out.println("PractiseServlet destroy method has called");
	}
}