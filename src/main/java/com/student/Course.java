package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component
public class Course {

	private int cid;
	private String cname;
	private double fee;
	
	@Autowired
	@Qualifier("stud")
	private Student stud;

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

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fee=" + fee + ", stud=" + stud + "]";
	}
	
	
	
}
