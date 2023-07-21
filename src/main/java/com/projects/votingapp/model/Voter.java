package com.projects.votingapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;



@Table(name="voters")
@Entity

public class Voter {
	
	@Id
	private long voterId;
	
	@Column(nullable=false)
	@NotEmpty(message = "Enter Username")
	private String userName;
	
	@Column(nullable=false, unique=true)
	@NotEmpty(message = "Password should not be empty")
	private String password;
	
	@Column(nullable=false)
	@Email
	private String email;
	
	@NotEmpty
	@Column(nullable=false)
	private String mobile;

	public long getVoterId() {
		return voterId;
	}

	public void setVoterId(long voterId) {
		this.voterId = voterId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Voter(long voterId,String userName,
			String password,  String email,
			 String mobile) {
		super();
		this.voterId = voterId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}

	public Voter() {
		super();
		
	}

	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}
	

	
}
		

