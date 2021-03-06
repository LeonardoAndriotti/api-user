package com.api.user;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.api.user.controller.CustumerEvaluationController;
import com.api.user.model.CustumerEvaluation;
import com.api.user.repository.CustumerEvaluationRepository;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ApiUserApplicationTests {

	private static final BigDecimal EVALUATION_TWO = new BigDecimal(2);

	private static final BigDecimal EVALUATION_FIVE = new BigDecimal(5);

	private static final Object EVALUATION_FOUR = new BigDecimal(4);

	@InjectMocks
	CustumerEvaluationController custumerEvaluationController;
	
	@Mock
	CustumerEvaluationRepository custumerEvaluationRepository;

	CustumerEvaluation listOne = new CustumerEvaluation();
	CustumerEvaluation listTwo = new CustumerEvaluation();
	CustumerEvaluation listTree = new CustumerEvaluation();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

		this.listOne.setEvaluation(EVALUATION_FIVE);
		this.listTwo.setEvaluation(EVALUATION_FIVE);
		this.listTree.setEvaluation(EVALUATION_TWO);
	}

	@Test
	public void custumerEvaluationTest() {

		List<CustumerEvaluation> list = Arrays.asList(listOne, listTwo, listTree);

		Mockito.when(custumerEvaluationRepository.findByUserId(BigDecimal.ONE)).thenReturn(list);

		BigDecimal createByEvaluation = custumerEvaluationController.createByEvaluation(BigDecimal.ONE);

		Assert.assertEquals(EVALUATION_FOUR, createByEvaluation);

	}

}
