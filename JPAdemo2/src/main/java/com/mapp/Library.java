package com.mapp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="library")
public class Library {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int l_id;
	
	String LibName;
	
	@OneToMany(targetEntity=Member.class)
	List<Member>  member;
	
	

	public List<Member> getMember() {
		return member;
	}

	public void setMember(List<Member> member) {
		this.member = member;
	}

	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public String getLibName() {
		return LibName;
	}

	public void setLibName(String libName) {
		LibName = libName;
	}
	
	

}
