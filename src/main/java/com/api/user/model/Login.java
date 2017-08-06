package com.api.user.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.api.user.validade.ValidationMessages;

@Entity
public class Login {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigDecimal id;
    @Column(length = 100)
    @NotNull(message=ValidationMessages.MESSAGE_LOGIN_NOT_NULL)
	private String login;
    @Column(length = 16)
    @NotNull(message=ValidationMessages.MESSAGE_PASSWORD_NOT_NULL)
	private String password;
	
	
	public Login(BigDecimal id, String login, String password) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
	}
	
	public Login(){}
	
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
