package com.api.user.DTO;

import java.math.BigDecimal;

import com.api.user.model.Andress;
import com.api.user.model.Login;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {
	@JsonProperty("id")
	private BigDecimal id;
	@JsonProperty("name")
	private String username;
	@JsonProperty("nickname")
	private String nickname;
	private Login login;
	private Andress andress;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Andress getAndress() {
		return andress;
	}

	public void setAndress(Andress andress) {
		this.andress = andress;
	}

}
