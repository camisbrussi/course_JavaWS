package com.camisbrussi.javaWS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camisbrussi.javaWS.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
