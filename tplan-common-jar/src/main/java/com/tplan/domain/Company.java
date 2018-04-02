package com.tplan.domain;

public class Company {

	private int id;
	
	private String name;
	
	private String describe;

	public Company(){
		
	}
	
	public Company(int id, String name, String describe) {
		super();
		this.id = id;
		this.name = name;
		this.describe = describe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	
}
