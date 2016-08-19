package org.nishant.servlet.init_parameters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PractiseServlet
 */
public class PractiseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String email;
	private String adminEmail;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PractiseServlet() {
		super();

		/*
		 * to show that ServletConfig instance gets initialized only after
		 * init() method
		 */
		ServletConfig servletConfig = getServletConfig();
		System.out.println("ServletConfig instance in the Constructor is "
				+ servletConfig);
	}

	@Override
	public void init() throws ServletException {
		super.init();
		ServletConfig servletConfig = getServletConfig();
		System.out.println("ServletConfig instance in the Constructor is "
				+ servletConfig);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletConfig servletConfig = getServletConfig();
		email = servletConfig.getInitParameter("email");

		ServletContext servletContext = getServletContext();
		adminEmail = servletContext.getInitParameter("admin_mail");

		PrintWriter out = response.getWriter();

		out.println("Hiiiiiii from " + servletConfig.getServletName());
		out.println("Email is " + email);
		out.println("Admin Email is " + adminEmail);
	}

	public String getEmail() {
		return email;
	}

	public String getAdminEmail() {
		return adminEmail;
	}
}