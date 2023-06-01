package com.sdet;

import java.util.ResourceBundle;

public class App {
	
	public int userLogin(String in_user,String in_pwd)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String UserName=rb.getString("username");
		String PassWord=rb.getString("password");
		
		if(in_user.equals(UserName) && in_pwd.equals(PassWord))
			return 1;
			
			else
				return 0;
			
	}

}
