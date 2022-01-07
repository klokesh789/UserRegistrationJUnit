package com.bridgelabz.userregistration;

public class PasswordException extends Exception {
	enum ExceptionType4 {
		ENTERED_NULL,ENTERED_EMPTY;
	}
	ExceptionType4 type;
	public PasswordException(ExceptionType4 type,String message) {
		super(message);
		this.type = type;
	}
}
