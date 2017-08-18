package com.api.user.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustumerEvaluation {
   
	@RequestMapping(value="/evaluation", method = RequestMethod.POST)
	public void createByEvaluation(@RequestParam("evaluation") BigDecimal evaluation,
			                       @RequestParam("idUser")BigDecimal idUser){
		
	}
}
