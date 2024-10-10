package com.maitq2.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maitq2.web.dao.UserDao;
import com.maitq2.web.model.User;

/**
 * Servlet implementation class GetUserController
 */
public class GetUserController extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int  id = Integer.parseInt(request.getParameter("userId"));
		UserDao userDao = new UserDao();
		User user = userDao.getUser(id);

		request.setAttribute("objUser", user);
		RequestDispatcher rDispatcher = request.getRequestDispatcher("showUser.jsp");
		rDispatcher.forward(request, response);
	}
}
