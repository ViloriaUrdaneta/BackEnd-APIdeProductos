package com.edutecno.jpacrud.servicio;

import com.edutecno.jpacrud.dto.ProductoDTO;
import com.edutecno.jpacrud.modelo.Product;

//Interfaz con declaración de todos los métodos del servicio
public interface ProductoService {
	
	//método que trae todos los productos
	public ProductoDTO getAllProducts();
	
	//método que trae producto por categoria
	public ProductoDTO findByCategory(Integer id_category);
	
	//método que trae producto por nombre
	public ProductoDTO findByNombre(String nombre);
	

}
