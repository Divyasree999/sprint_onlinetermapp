package com.cg.terminsurancepolicy.exception;

import java.util.Date;

public class ErrorDetails {
	
	/**
	 * Attributes
	 */
	private Date timestamp;
	private String message;
	private String details;

	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	/*
	  *getters implementation to get the values
	  */


	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
}
