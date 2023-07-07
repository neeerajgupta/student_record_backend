package com.studentregistration.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentslist")
public class Students {
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long rollno;
	
	String name;
	
	String email;
	
	String subjec;
	
	public Students(long rollno, String name, String email, String subjec, long mobno) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.subjec = subjec;
		this.mobno = mobno;
	}

	public long getRollno() {
		return rollno;
	}

	public void setRollno(long rollno) {
		this.rollno = rollno;
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

	public String getSubjec() {
		return subjec;
	}

	public void setSubjec(String subjec) {
		this.subjec = subjec;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", email=" + email + ", subjec=" + subjec + ", mobno="
				+ mobno + "]";
	}

	long mobno;
	

}
