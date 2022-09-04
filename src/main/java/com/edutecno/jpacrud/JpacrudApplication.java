package com.edutecno.jpacrud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.edutecno.jpacrud.modelo.Product;
import com.edutecno.jpacrud.repositorio.ProductRepository;

@SpringBootApplication
public class JpacrudApplication {
	
	private static final Logger log = LoggerFactory.getLogger(JpacrudApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(JpacrudApplication.class, args);
	}


	
}
