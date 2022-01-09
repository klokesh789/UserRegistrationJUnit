package com.bridgelabz.userregistration;

public class UserValidationException extends Exception {
	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}

	ExceptionType type;

	public UserValidationException(ExceptionType type, String message) {

		super(message);
		this.type = type;
		
	}

}
