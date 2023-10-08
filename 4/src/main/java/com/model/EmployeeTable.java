package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeTable {
	
	@Id
	@GeneratedValue
	Long id;
	
	String name,email,location;
	
public EmployeeTable()
{}

@Override
public String toString() {
	return "EmployeeTable [id= "+id+", name= "+name+", email= "+email+", location= "+location+"]";
}

public EmployeeTable(Long id,String name,String email,String location)
{
	super();
	this.id=id;
	this.name=name;
	this.email=email;
	this.location=location;
	
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

}
