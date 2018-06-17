package com.ToDo.ToDoObject;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ToDo.ToDoObject.ToDoService;

@WebServlet(urlPatterns="/add-todo.do")
public class AddToDoServlet extends HttpServlet{
	
	private ToDoService todoService = new ToDoService(); 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password")); 
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String newToDo = request.getParameter("todo"); 
		String category = request.getParameter("category"); 
		todoService.addToDo(new ToDo(newToDo, category));
		response.sendRedirect("/list-todos.do");
		
	}
	

	
	
	
}
