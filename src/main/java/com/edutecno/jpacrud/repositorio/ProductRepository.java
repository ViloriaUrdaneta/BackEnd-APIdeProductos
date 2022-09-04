package com.edutecno.jpacrud.repositorio;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.edutecno.jpacrud.modelo.Product;

/**
 * Repositorio que extiende de CrudRepository con su tipo de entidad y tipo de dato de su id, también extiende de PagingAndSorting
 * */
public interface ProductRepository extends CrudRepository<Product, Integer>, PagingAndSortingRepository<Product, Integer> {

	//Query para génerar método de busqueda por el id
	@Query("from Product where id_producto = ?1")
	public Optional<Product> findById(Integer id);
	
	//Query para génerar método de busqueda por el nombre
	@Query("from Product where name = ?1")
	public List<Product> findByName(String nombre);
	
	//Query para génerar método de busqueda por el nombre
	@Query("from Product where category = ?1")
	public List<Product> findByCategory(Integer id_category);
	
}
