package com.bridgelabz.userregistration;

public class LastNameException extends Exception {
	enum ExceptionType1 {
		ENTERED_NULL,ENTERED_EMPTY;
	}
	ExceptionType1 type;
	public LastNameException(ExceptionType1 type,String message) {
		super(message);
		this.type = type;
	}
}
