package com.edutecno.jpacrud.modelo;

public class Category {

	//Fields 
	private Integer id;
	private String name;
	
	//Constructors
	public Category() {
		super();
	}
	public Category(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//Getters and Setters
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
	
	//ToString
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
}
