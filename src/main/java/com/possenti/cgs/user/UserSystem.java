package com.possenti.cgs.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserSystem {

	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String userName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String password;

	public UserSystem() {
		
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
	
	
}