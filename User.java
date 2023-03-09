package com.Humancloud.HealthCare.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotBlank
	@Size(min = 5, max = 20, message = "First name should be between 5 to 20 character")
	private String firstName;
	
	@NotBlank
	@Size(min = 5, max = 20, message = "Last name should be between 5 to 20 character")
	private String lastName;
	
	@Column(unique = true)
	@NotBlank
	private String userName;
	
	@NotBlank
	@Pattern(regexp ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$" )
	private String password;
	
    @NotBlank
	private String confirmPassword;
    
	@Embedded
	private Adress address;
	
	@Column(unique = true)
	@Email(message = " Email Should be valid")
	@Pattern(regexp = "^[A-Za-z0-9.-]+@[A-Za-z0-9.-]+$", message = "Email format is invalid")
	@NotEmpty
	private String email;
	
	@JsonFormat(pattern = "MM-dd-yyyy")
	@Column(name = "date_of_birth")
	private Date dob;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Adress getAddress() {
		return address;
	}
	public void setAddress(Adress address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id,
			@NotBlank @Size(min = 5, max = 20, message = "First name should be between 5 to 20 character") String firstName,
			@NotBlank @Size(min = 5, max = 20, message = "Last name should be between 5 to 20 character") String lastName,
			@NotBlank String userName,
			@NotBlank @Pattern(regexp = "^.(?=.{8,30})(?=.\\d)(?=.[a-zA-Z])|(?=.{8,30})(?=.\\d)(?=.[!@#$%^&])|(?=.{8,30})(?=.[a-zA-Z])(?=.[!@#$%^&]).$") String password,
			@NotBlank String confirmPassword, Adress address,
			@Email(message = " Email Should be valid") @Pattern(regexp = "^[A-Za-z0-9.-]+@[A-Za-z0-9.-]+$", message = "Email format is invalid") @NotEmpty String email,
			Date dob) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.address = address;
		this.email = email;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", address=" + address
				+ ", email=" + email + ", dob=" + dob + "]";
	}
	

}