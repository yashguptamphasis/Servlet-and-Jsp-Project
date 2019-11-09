package com.prac;

public class Student {
	
	@Override
	public String toString() {
		return "Student [email=" + email + ", pass=" + pass + "]";
	}

	private String email;
	private String pass;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	boolean validate()
	{
		if(email.equals("yash@gmail.com")&&pass.equals("pass"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
