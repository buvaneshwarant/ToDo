package com.ToDo.ToDoObject;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ToDo.ToDoObject.ToDoService;

@WebServlet(urlPatterns="/delete-todo.do")
public class DeleteToDoServlet extends HttpServlet{
	
	private ToDoService todoService = new ToDoService(); 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		todoService.deleteToDo(new ToDo(request.getParameter("todo")));

		response.sendRedirect("/list-todos.do");
		
		
	}
	
}
