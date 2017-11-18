package com.api.user.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.user.model.PhysicalPerson;

public interface UserPhysivalPersonRepository extends JpaRepository<PhysicalPerson, BigDecimal>{
	public final static String FIND_BY_NAME_QUERY = "SELECT * " + 
            "FROM userphysical WHERE name like :name;";
	
	
     List<PhysicalPerson> findByName(String name);

}
