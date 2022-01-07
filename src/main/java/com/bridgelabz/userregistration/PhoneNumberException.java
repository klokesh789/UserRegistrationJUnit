package com.bridgelabz.userregistration;

public class PhoneNumberException extends Exception {
	enum ExceptionType3 {
		ENTERED_NULL,ENTERED_EMPTY;
	}
	ExceptionType3 type;
	public PhoneNumberException(ExceptionType3 type,String message) {
		super(message);
		this.type = type;
	}
}
