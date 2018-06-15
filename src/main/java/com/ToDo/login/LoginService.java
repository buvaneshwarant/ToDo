package com.ToDo.login;

public class LoginService {
	
	public boolean isUserValid(String user, String password) {
		
		if(user.equals("a") && password.equals("b"))
			return true;
		
		return false; 
	}
}
