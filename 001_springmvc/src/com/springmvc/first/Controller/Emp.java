package com.springmvc.first.Controller;
public class Emp {  
private int id;  
private String name;  
  
private String location;

public Emp(int id, String name, String location) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}  
  

}
