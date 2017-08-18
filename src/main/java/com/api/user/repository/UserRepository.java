package com.api.user.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.user.model.User;

public interface UserRepository extends JpaRepository<User, BigDecimal>{
	public final static String FIND_BY_NAME_QUERY = "SELECT * " + 
            "FROM profile WHERE name like :name;";
	
	
    List<User> findByName(String name);

}
