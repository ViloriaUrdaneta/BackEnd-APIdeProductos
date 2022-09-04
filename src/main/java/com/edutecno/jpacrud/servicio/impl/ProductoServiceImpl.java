package com.edutecno.jpacrud.servicio.impl;

import java.util.ArrayList;
import java.util.List;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.jpacrud.dto.ProductoDTO;
import com.edutecno.jpacrud.modelo.Product;
import com.edutecno.jpacrud.repositorio.ProductRepository;
import com.edutecno.jpacrud.servicio.ProductoService;

//Implementación de los metodos del servicio
@Service
public class ProductoServiceImpl implements ProductoService{

	private static final Logger log = LoggerFactory.getLogger(ProductoServiceImpl.class);
	
	//Inyección del repositorio como objato de acceso de datos DAO
	@Autowired
	ProductRepository dao;
	
	//Declaración del DTO con la lista de productos
	ProductoDTO respuesta;
	
	//Metodos implementados
	
	//método que trae todos los productos
	
	@Override
	@Transactional(readOnly = true)
	public ProductoDTO getAllProducts() {
		//Inicializamos el DTO
		respuesta = new ProductoDTO(new ArrayList<Product>());
		//Intentamos llamar al metodo findAll de la instancia del crudRepository y setear la respuesta
		try {
			respuesta.setProductos((List<Product>) dao.findAll());
		}catch(Exception e) {
			//debug
			log.trace("Usuario Service : Error en método getAllProductos", e);
		}
		//devolvemos respuesta
		return respuesta;
	}
	
	//método que consigue producto por categoria
	
	@Override
	@Transactional
	public ProductoDTO findByCategory(Integer id_category) {
		//Inicializamos el DTO
		respuesta = new ProductoDTO(new ArrayList<Product>());
		//Intentamos llamar al metodo findAll de la instancia del crudRepository y setear la respuesta
		try {
			respuesta.setProductos((List<Product>) dao.findByCategory(id_category));
		}catch(Exception e) {
		//debug
			log.trace("Usuario Service : Error en método findByCategory", e);
		}
		//devolvemos respuesta
		return respuesta;
	}

	//método que consigue producto por nombre
	
	@Override
	@Transactional
	public ProductoDTO findByNombre(String nombre) {
		//Inicializamos el DTO
		respuesta = new ProductoDTO(new ArrayList<Product>());
		try {
			//Creamos lista de productos y agregamos el producto que trae el dao
			List<Product> lp = dao.findByName(nombre);
			//Setteamos la respuesta
			respuesta.setProductos(lp);
		}catch(Exception e) {
			//debug
			log.trace("Usuario Service : Error en método findByNombre", e);
		}
		//devolvemos la respuesta
		return respuesta;
	}
	
	


	

	

	


}
