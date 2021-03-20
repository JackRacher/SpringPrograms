package com.student;

//import org.springframework.stereotype.Component;
//
//@Component("stud")
public class Student {

	private int sno;
	private String sname;
	private String city;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", city=" + city + "]";
	}
	
	
	
}
