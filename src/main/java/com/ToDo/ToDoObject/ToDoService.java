package com.ToDo.ToDoObject;

import java.util.List;
import java.util.ArrayList;

public class ToDoService {
	private static List<ToDo> todos = new ArrayList<ToDo>(); 

	static {
		todos.add(new ToDo("Learn Web Application Development", "Study")); 
		todos.add(new ToDo("Learn Spring MVC", "Study")); 
		todos.add(new ToDo("Learn Spring Rest Services", "Study")); 
		
	}
	
	public List<ToDo> retrieveToDo(){
		return todos; 
	}
	
	public void addToDo(ToDo todo) {
		todos.add(todo); 
	}
	
	public void deleteToDo(ToDo todo) {
		todos.remove(todo); 
	}

}
