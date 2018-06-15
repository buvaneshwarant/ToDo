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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String newToDo = request.getParameter("todo"); 
		todoService.addToDo(new ToDo(newToDo));
		
		response.sendRedirect("/todo.do");
		
	}
	
}
