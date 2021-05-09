package Entities;

import java.util.Date;

public class Customer{
	public int id;
	public String FirstName;
	public String LastName;
	public Date DateOfBirth;
	public String NationalityID;
	
	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityID) {
		//super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityID = nationalityID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalityID() {
		return NationalityID;
	}
	public void setNationalityID(String nationalityID) {
		NationalityID = nationalityID;
	}
	

}
