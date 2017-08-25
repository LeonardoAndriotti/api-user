package com.api.user.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustumerEvaluation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigDecimal id;
	private BigDecimal evaluation;
	private BigDecimal userId;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(BigDecimal evaluation) {
		this.evaluation = evaluation;
	}

	public BigDecimal getUserId() {
		return userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

}
