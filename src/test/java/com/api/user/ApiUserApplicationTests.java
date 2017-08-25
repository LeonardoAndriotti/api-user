package com.api.user;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.api.user.controller.CustumerEvaluationController;
import com.api.user.model.CustumerEvaluation;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiUserApplicationTests {

	@Test
	public void custumerEvaluationTest() {
		CustumerEvaluation ce = new CustumerEvaluation();
		ce.setEvaluation(new BigDecimal(5));
		CustumerEvaluation ce2 = new CustumerEvaluation();
		ce2.setEvaluation(new BigDecimal(5));
		CustumerEvaluation ce3 = new CustumerEvaluation();
		ce3.setEvaluation(new BigDecimal(5));
		
		List<CustumerEvaluation> list = Arrays.asList(ce,ce2,ce3);
		CustumerEvaluation mock = Mockito.mock(CustumerEvaluation.class);
		
		Mockito.when(mock.getEvaluation()).thenReturn(new BigDecimal(5));
		CustumerEvaluationController cec = new CustumerEvaluationController();
		BigDecimal createByEvaluation = cec.createByEvaluation(BigDecimal.ONE);
		Assert.assertEquals(new BigDecimal(5), createByEvaluation);
	}



}
