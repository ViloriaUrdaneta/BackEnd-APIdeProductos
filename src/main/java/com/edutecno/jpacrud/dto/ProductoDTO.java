package com.edutecno.jpacrud.dto;

import java.util.List;

import com.edutecno.jpacrud.modelo.Product;

//Objeto de vista de lista productos que hereda mensaje y código de GenericVO
public class ProductoDTO {

	//List
	List<Product> productos;
	
	//Constructors
	public ProductoDTO(List<Product> productos) {
		this.productos = productos;
	}
	public ProductoDTO() {
		super();
	}
	
	//Getters y setters
	public List<Product> getProductos() {
		return productos;
	}
	public void setProductos(List<Product> productos) {
		this.productos = productos;
	}
	
	//HashCode y equals
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}

