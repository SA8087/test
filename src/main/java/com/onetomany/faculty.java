package com.onetomany;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class faculty {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int fid;
	String fname;
	
	@OneToMany
	@JoinColumn(name="fid")
    List<FacultySubject> fsubject;

	public faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public faculty(String fname) {
		super();
		this.fname = fname;
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public List<FacultySubject> getFsubject() {
		return fsubject;
	}

	public void setFsubject(List<FacultySubject> fsubject) {
		this.fsubject = fsubject;
	}

	@Override
	public String toString() {
		return "faculty [fid=" + fid + ", fname=" + fname + ", fsubject=" + fsubject + "]";
	}
	
}
