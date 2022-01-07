package com.bridgelabz.userregistration;

public class EmailException extends Exception {
	enum ExceptionType2 {
		ENTERED_NULL,ENTERED_EMPTY;
	}
	ExceptionType2 type;
	public EmailException(ExceptionType2 type,String message) {
		super(message);
		this.type = type;
	}
}
