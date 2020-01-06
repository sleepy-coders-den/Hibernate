package com.deloitte.firstmvn.hibfirst.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column(name="eid")
	int empid;
	String name;
	double salary;
	@Column(name="dob")
	Date doj;

	public Employee() {
		super();
	}

	public Employee(int empid, String name, double salary, Date doj) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date obj) {
		this.doj = doj;
	}

}