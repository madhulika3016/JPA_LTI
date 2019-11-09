package com.inherit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="account12")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int a_id;
	
	String Aname;

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}
	
	

}
