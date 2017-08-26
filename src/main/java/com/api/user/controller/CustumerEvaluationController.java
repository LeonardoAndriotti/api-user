package com.api.user.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.user.model.CustumerEvaluation;
import com.api.user.repository.CustumerEvaluationRepository;

@RestController
public class CustumerEvaluationController {

	private static final int PERCENT_TOTAL = 100;
	private static final int MAX_STAR = 5;

	@Autowired
	public CustumerEvaluationRepository custumerEvaluationRepository;

	@RequestMapping(value = "/evaluation", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void createByEvaluation(@RequestBody CustumerEvaluation evaluation) {
		this.custumerEvaluationRepository.save(evaluation);
	}

	@RequestMapping(value = "/evaluation", method = RequestMethod.GET)
	public List<CustumerEvaluation> createByEvaluation() {
		return this.custumerEvaluationRepository.findAll();
	}

	@RequestMapping(value = "/evaluation/{id}", method = RequestMethod.GET)
	public BigDecimal createByEvaluation(@PathVariable BigDecimal id) {
		return calculate(this.custumerEvaluationRepository.findByUserId(id));
	}
	public BigDecimal createByEvaluationteste(List<CustumerEvaluation> list) {
		return calculate(list);
	}

	private BigDecimal calculate(List<CustumerEvaluation> custumerEvaluation) {
		BigDecimal sun = BigDecimal.ZERO;

		for (CustumerEvaluation custumer : custumerEvaluation) {
			sun = sun.add(custumer.getEvaluation());
		}

		sun = sun.divide(new BigDecimal(custumerEvaluation.size()).multiply(new BigDecimal(MAX_STAR)))
				.multiply(new BigDecimal(PERCENT_TOTAL));

		BigDecimal result = new BigDecimal(MAX_STAR).multiply(sun).divide(new BigDecimal(PERCENT_TOTAL)).setScale(0,
				RoundingMode.CEILING);
		return (result.compareTo(new BigDecimal(MAX_STAR)) == 1) ? new BigDecimal(MAX_STAR) : result;

	}
}
