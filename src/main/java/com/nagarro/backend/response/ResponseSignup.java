package com.nagarro.backend.response;

public class ResponseSignup {
	private boolean status;
	private String message;

	public boolean isStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
