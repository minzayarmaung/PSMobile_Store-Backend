package com.project.psmobile.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// EMPDB
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long syskey;
	private Long employeeID;
	private String employeeName;
	private String username;
	private String password;
	private String gender;
	private String phoneNo;
	private String email;
	private String address;
	private String position;
	private Long salary;
	
	public Employee() {
		super();
	}

	public Employee(Long syskey, Long employeeID, String employeeName, String username, String password, String gender,
			String phoneNo, String email, String address, String position, Long salary) {
		super();
		this.syskey = syskey;
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		this.position = position;
		this.salary = salary;
	}
	
	public Long getSyskey() {
		return syskey;
	}
	public void setSyskey(Long syskey) {
		this.syskey = syskey;
	}
	public Long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName; 
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	

}
