package com.camisbrussi.javaWS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camisbrussi.javaWS.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
