package com.revature.ers.bean;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "ERS_USER")
@SequenceGenerator(name="USERID_SEQ", initialValue=1, allocationSize=100)
public class ERSUser implements Serializable {

	private static final long serialVersionUID = 3555807154773104821L;
	
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERID_SEQ")
	private Integer userID;
	
	@Column(name="FIRST_NAME")
	@NotEmpty(message="First name cannot be empty.")
	private String firstName;
	
	@Column(name="LAST_NAME")
	@NotEmpty(message="Last name cannot be empty.")
	private String lastName;
	
	@Column(name="EMAIL")
	@NotEmpty(message="Email cannot be empty.")
	// I want a unique constrant here, too.
	private String email;
	
	@Column(name="PHONE")
	@NotEmpty(message="Phone number cannot be empty.")
	private String phoneNumber;
	
	@Column(name="USERNAME")
	@NotEmpty(message="Username cannot be empty.")
	//Unique
	private String username;
	
	@Column(name="PASSWORD")
	@NotEmpty(message="Password cannot be empty.")
	private String password;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="ROLE_ID", referencedColumnName="ROLE_ID")
	private UserRole role;

	
	public ERSUser() {
		super();
	}

	public ERSUser(String firstName, String lastName, String email, String phoneNumber, String username,
			String password, UserRole role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public Integer getUserID() {
		return userID;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "ERSUser [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", username=" + username + ", password=" + password + ", role="
				+ role + "]";
	}
}
