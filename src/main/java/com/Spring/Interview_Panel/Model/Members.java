package com.Spring.Interview_Panel.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Members {

	@Id
	@Column(name="employeeid")
	private int employeeId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column (name="position")
	private String position;
	
	
	public String getEmail() {
		return email;
	}
	
	public Number getEmployeeId() {
		return employeeId;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	}