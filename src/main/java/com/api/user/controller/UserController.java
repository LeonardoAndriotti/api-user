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

import com.api.user.model.PhysicalPerson;
import com.api.user.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void savingUserInApplication(@RequestBody PhysicalPerson user) {
		userRepository.save(user);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<PhysicalPerson> findAllUser() {
		return userRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public PhysicalPerson findUserById(@PathVariable BigDecimal id) {
		return userRepository.findOne(id);
	}
	
	@RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
	public List<PhysicalPerson> findUserByName(@PathVariable String name) {
		return userRepository.findByName(name);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody PhysicalPerson user) {
		userRepository.saveAndFlush(user);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable BigDecimal id) {
		userRepository.delete(id);
	}

}
