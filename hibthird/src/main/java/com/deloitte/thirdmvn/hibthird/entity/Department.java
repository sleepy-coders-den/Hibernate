package com.deloitte.thirdmvn.hibthird.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Department {
	@Id
	int dno;
	String dname;
	//@OneToMany
	//@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.REMOVE)
	@OneToMany(mappedBy="dept")
	List<Employee> elist;
	public Department() {
		super();
	}
	public Department(int dno, String dname, List<Employee> elist) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.elist = elist;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int deptno) {
		this.dno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Employee> getElist() {
		return elist;
	}
	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}
	

}
