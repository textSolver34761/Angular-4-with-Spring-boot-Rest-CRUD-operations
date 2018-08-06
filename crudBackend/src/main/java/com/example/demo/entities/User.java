package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;
	private String frist_name;
	private String last_name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrist_name() {
		return frist_name;
	}
	public void setFrist_name(String frist_name) {
		this.frist_name = frist_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	public User(String frist_name, String last_name) {
		this.frist_name = frist_name;
		this.last_name = last_name;
	}
	public User() {
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", frist_name=" + frist_name + ", last_name=" + last_name + "]";
	}
	
	

}
