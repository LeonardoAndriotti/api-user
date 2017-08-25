package com.api.user.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.user.model.CustumerEvaluation;

public interface CustumerEvaluationRepository extends JpaRepository<CustumerEvaluation,BigDecimal>{
	 List<CustumerEvaluation> findByUserId(BigDecimal id);
}
