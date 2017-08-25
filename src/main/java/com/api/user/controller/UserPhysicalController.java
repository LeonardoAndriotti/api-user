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
import com.api.user.repository.UserPhysivalPersonRepository;


@RestController
public class UserPhysicalController {
	@Autowired
	private UserPhysivalPersonRepository userRepository;

	@RequestMapping(value = "/user/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void savingUserInApplication(@RequestBody PhysicalPerson user) {
		userRepository.save(user);
	}

	@RequestMapping(value = "/user/get", method = RequestMethod.GET)
	public List<PhysicalPerson> findAllUser() {
		return userRepository.findAll();
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public PhysicalPerson findUserById(@PathVariable BigDecimal id) {
		return userRepository.findOne(id);
	}
	
	@RequestMapping(value = "/user/name/{name}", method = RequestMethod.GET)
	public List<PhysicalPerson> findUserByName(@PathVariable String name) {
		return userRepository.findByName(name);
	}
	
	@RequestMapping(value = "/user/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody PhysicalPerson user) {
		userRepository.saveAndFlush(user);
	}
	
	@RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable BigDecimal id) {
		userRepository.delete(id);
	}

}