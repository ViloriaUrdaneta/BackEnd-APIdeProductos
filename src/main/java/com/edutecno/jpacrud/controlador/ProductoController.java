package com.edutecno.jpacrud.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.jpacrud.dto.ProductoDTO;


import com.edutecno.jpacrud.servicio.impl.ProductoServiceImpl;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ProductoController {

	
	//Se inyecta el Servicio de productos
	@Autowired
	private ProductoServiceImpl svc;
	
	//Log para el debug
	private static final Logger log = LoggerFactory.getLogger(ProductoController.class);
	
	//api que nos trae todos los productos
	@GetMapping("/productos")
	public ProductoDTO listarProducts() {
		return svc.getAllProducts();
	}
	
	//api que nos trae productos por categoria
	@GetMapping("/productos/{id}")
	public ProductoDTO productosByCategory(@PathVariable(name = "id") Integer id) {
		return svc.findByCategory(id);
		
	}
	
}
