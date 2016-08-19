package org.nishant.servlet.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class PractiseServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {

		System.out.println("Initializing the Servlet Context................");

		ServletContext servletContext = event.getServletContext();

		String name = servletContext.getInitParameter("admin_name");
		Integer age = Integer.valueOf(servletContext
				.getInitParameter("admin_age"));
		String mail = servletContext.getInitParameter("admin_mail");
		String gender = servletContext.getInitParameter("admin_gender");

		Admin admin = new Admin(name, age, mail, gender);

		servletContext.setAttribute("admin", admin);

		System.out.println("ServletContext sucessfully initialized");
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {

		System.out.println("Destroying the Servlet Context................");

		ServletContext servletContext = event.getServletContext();

		servletContext.removeAttribute("admin");

		System.out.println("ServletContext sucessfully destroyed");
	}

}