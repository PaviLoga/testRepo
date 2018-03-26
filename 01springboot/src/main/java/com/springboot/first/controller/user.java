package com.springboot.first.controller;

public class user {
	private String name;
	private String email;
	public user(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
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
	

}
