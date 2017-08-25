package com.api.user.model;

import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.api.user.validade.ValidationMessages;

@Entity
@Table(name = "juridical_person")
@AttributeOverride(name = "createDate", column = @Column(name = "std_entry_date"))
public class JuridicalPerson extends User {

	private static final long serialVersionUID = 1L;
	
	@Column(length = 60)
	@NotNull(message = ValidationMessages.MESSAGE_COMPANY_NOT_NULL)
	private String company;
	@NotNull(message = ValidationMessages.MESSAGE_TRADE_NOT_NULL)
	private String trade;
	@NotNull(message = ValidationMessages.MESSAGE_CNPJ_NOT_NULL)
	private String cnpj;

	public JuridicalPerson(BigDecimal id, String company, String trade, String cnpj) {
		super(id);
		this.company = company;
		this.trade = trade;
		this.cnpj = cnpj;
	}

	public String getCompany() {
		return company;
	}

	public String getTrade() {
		return trade;
	}

	public String getCnpj() {
		return cnpj;
	}
}
