package com.api.user.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.user.model.JuridicalPerson;

public interface UserJuridicalPersonRepository extends JpaRepository<JuridicalPerson, BigDecimal>{
	public final static String FIND_BY_COMPANY_QUERY = "SELECT * " + 
            "FROM profile WHERE company like :company;";	
     List<JuridicalPerson> findByCompany(String company);
}
