package com.lti.cascadedemo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ITStudent")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int s_id;
	
	String sname;
	
@OneToMany(mappedBy="student" , cascade= {CascadeType.ALL} ,fetch=FetchType.LAZY)
	List<Subject>  subject;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", sname=" + sname + ", subject=]";
	}

	
	
}
