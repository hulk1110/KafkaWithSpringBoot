package com.mdp.kakfa.mdpconsumer.consumer;
import java.io.Serializable;

public class User implements Serializable{

	private String name;

	private String department;
	private long Salary;

	public User() {

	}

	public User(String name, String department, long salary) {

		this.name = name;
		this.department = department;
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", department=" + department + ", Salary=" + Salary + "]";
	}

}
