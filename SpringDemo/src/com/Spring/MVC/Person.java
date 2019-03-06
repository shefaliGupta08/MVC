package com.Spring.MVC;

public class Person {
	
	private String Title;
	private String FirstName;
	private String LastName;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [Title=" + Title + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	

}
