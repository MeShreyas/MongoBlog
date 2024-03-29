package com.nc.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nc.servlets.helpers.LoginService;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		int option = Integer.valueOf(req.getParameter("operation"));
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		switch(option) {
		// User SignUp
		case 1:
			break;
		// User Login and set cookie
		case 2:
			// Validate with mongodb and check if user exists
			LoginService service = new LoginService();
			service.validateuser(username,password);
			break;
		default:
			break;
		}
			

		
	}

}
