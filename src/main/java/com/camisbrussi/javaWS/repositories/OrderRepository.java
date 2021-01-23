package com.camisbrussi.javaWS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camisbrussi.javaWS.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
