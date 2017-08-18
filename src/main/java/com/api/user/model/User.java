package com.api.user.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.api.user.validade.*;

@Entity
@Table(name="profile")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigDecimal id;
    @Column(length = 60)
    @NotNull(message=ValidationMessages.MESSAGE_NAME_NOT_NULL)
    private String name;
    
    private String nickname;
    
    
    @Embedded
    private Andress andress;
    
    @Embedded
    private Login login;
    

	public User(BigDecimal id, String name, String nickname) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nickname;

	}
	
	public User(){}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public Andress getAndress() {
		return andress;
	}

	public void setAndress(Andress andress) {
		this.andress = andress;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	
	
}
