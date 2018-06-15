package com.ToDo.ToDoObject;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ToDo.ToDoObject.ToDoService;

@WebServlet(urlPatterns="/todo.do")
public class ToDoServlet extends HttpServlet{
	
	private ToDoService todoService = new ToDoService(); 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("todos", todoService.retrieveToDo());
		request.setAttribute("password", request.getParameter("password")); 
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
		
	}
	
}
