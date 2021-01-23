package com.camisbrussi.javaWS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camisbrussi.javaWS.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
