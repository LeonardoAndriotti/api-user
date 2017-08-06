package com.api.user.controller;

import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.user.DTO.UserDTO;



@RestController
public class UserController {
	
  @RequestMapping(value = "/", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
   public List<UserDTO> findAll(@RequestBody UserDTO user){
	   return Lists.newArrayList(user);
   }
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<UserDTO> findAll2(@RequestBody UserDTO user){
	   return Lists.newArrayList(user);
  }
}
