package com.myweb.demo.domain;

public class User {
	public User() {
    }
	public User(String name, String password) {
		this.username = name;
	    this.password = password;
    }
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
