package com.deloitte.thirdmvn.hibthird.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import java.util.List;

import javax.persistence.*;
@Entity
public class Courses {
	@Id
	int cid;
	String cname;
	int duration;
	@ManyToMany
	@JoinTable(name="student_course_reg",joinColumns= {@JoinColumn(name="cid")},inverseJoinColumns= {@JoinColumn(name="sid")})
	List<Student> slist;
	public Courses() {
		super();
	}
	public Courses(int cid, String cname, int duration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public List<Student> getSlist() {
		return slist;
	}
	public void setSlist(List<Student> slist) {
		this.slist = slist;
	}
	
	

}
