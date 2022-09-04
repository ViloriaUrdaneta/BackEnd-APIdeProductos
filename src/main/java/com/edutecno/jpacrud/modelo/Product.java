package com.edutecno.jpacrud.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//Se crea POJO entidad de producto
@Entity
@SequenceGenerator(name="product_id_seq", initialValue=1, sequenceName = "product_id_seq", allocationSize =1)
public class Product {

	//se marca el id y se crea secuencia, y se crean los otros atributos
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_id_seq")
	private Integer id_producto;
	private String name;
	private Float price;
	private Integer discount;
	private Integer category;

	
	//Constructor vacio y con atributos
	public Product() {
		super();
	}
	public Product(Integer id_producto, String name, Float price, Integer discount, Integer category) {
		super();
		this.id_producto = id_producto;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.category = category;
	}


	//Getters y Setters
	public Integer getId() {
		return id_producto;
	}
	public void setId(Integer id_producto) {
		this.id_producto = id_producto;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "Product [id=" + id_producto + ", name=" + name + ", price=" + price + ", discount=" + discount + ", category="
				+ category + "]";
	}
	
	
	
	
}
