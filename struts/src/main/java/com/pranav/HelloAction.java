package com.pranav;

public class HelloAction {

	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;



	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}



	public String execute() {
		System.out.println("HelloAction Execute");
		return "SUCCESS";
	}
}
