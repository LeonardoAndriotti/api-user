package com.api.user.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.user.model.JuridicalPerson;
import com.api.user.repository.UserJuridicalPersonRepository;

@RestController
public class UserJuridicalController {
	
	@Autowired
	private UserJuridicalPersonRepository companyRepository;
	
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void saveCompanyInAplication(@RequestBody JuridicalPerson company){
		companyRepository.save(company);		
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<JuridicalPerson> findAllUser(){
		return companyRepository.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public JuridicalPerson findUserById(@PathVariable BigDecimal id){
		return companyRepository.findOne(id);
	}
	@RequestMapping(value = "/company/{companyName}")
	public List<JuridicalPerson> findUserByName(@PathVariable String companyName){
		return companyRepository.findByCompany(companyName);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody JuridicalPerson company){
		companyRepository.saveAndFlush(company);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@RequestBody BigDecimal id){
		companyRepository.delete(id);
	}
	
	
}
