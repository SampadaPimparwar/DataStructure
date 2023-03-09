package com.Humancloud.HealthCare.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;


@Embeddable
public class Adress {

@NotBlank
@Column(length = 100)
private String uAdrees;

@NotBlank
private String State;

@NotBlank
private String city;

public String getuAdrees() {
	return uAdrees;
}
public void setuAdrees(String uAdrees) {
	this.uAdrees = uAdrees;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Adress() {
	super();
	// TODO Auto-generated constructor stub
}
public Adress(@NotBlank String uAdrees, @NotBlank String state, @NotBlank String city) {
	super();
	this.uAdrees = uAdrees;
	State = state;
	this.city = city;
}
@Override
public String toString() {
	return "Adress [uAdrees=" + uAdrees + ", State=" + State + ", city=" + city + "]";
}


}