package com.api.user.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import com.api.user.validade.ValidationMessages;

@Embeddable
public class Andress {

    @Column(length = 150)
    @NotNull(message=ValidationMessages.MESSAGE_STREET_NOT_NULL)
	private String street;
    @Column(length = 100)
    @NotNull(message=ValidationMessages.MESSAGE_STATE_NOT_NULL)
    private String state;
    @Column(length = 100)
    @NotNull(message=ValidationMessages.MESSAGE_REGION_NOT_NULL)
	private String region;
    @Column(length = 10)
    @NotNull(message=ValidationMessages.MESSAGE_NUMBER_NOT_NULL)
	private String street_number;
    @Column(length = 100)
    @NotNull(message=ValidationMessages.MESSAGE_CITY_NOT_NULL)
	private String city;
    @Column(length = 25)
    @NotNull(message=ValidationMessages.MESSAGE_COUNTRY_NOT_NULL)
	private String country;
    @Column(length = 255)
	private String complement;

	public Andress(BigDecimal id, String street, String region, String number, String city, String country,
			String complement) {
		super();
	
		this.street = street;
		this.region = region;
		this.street_number = number;
		this.city = city;
		this.country = country;
		this.complement = complement;
	}

	public Andress() {
	}



	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getNumber() {
		return street_number;
	}

	public void setNumber(String number) {
		this.street_number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

}
