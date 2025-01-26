package com.in28minutes.rest.webservices.restful_web_services.user;

import java.time.LocalDate;

public class User {

	private Integer id;
	private String name;
	private LocalDate barthDate;

	public User(Integer id, String name, LocalDate barthDate) {
		super();
		this.id = id;
		this.name = name;
		this.barthDate = barthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBarthDate() {
		return barthDate;
	}

	public void setBarthDate(LocalDate barthDate) {
		this.barthDate = barthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", barthDate=" + barthDate + "]";
	}

}
