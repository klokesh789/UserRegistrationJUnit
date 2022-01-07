package com.bridgelabz.userregistration;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailTest {
	private String email;
	private boolean expectedResult;
	
	public EmailTest(String email,boolean expectedResult) {
		super();
		this.email = email;
		this.expectedResult=expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{"abc@yahoo.com",true},
											{"abc-100@yahoo.com",true},
											{"abc.100@yahoo.com",true},
											{"abc111@abc.com",true},
											{"abc-100@abc.net",true},
											{"abc@1.com",true},
											{"abc.100@abc.com.au",true},
											{"abc@gmail.com.com",true},
											{"abc+100@gmail.com",true},
											{"abccom",false},
											{".abc@.com.my",false},
											{"abc123@gmail.a",false},
											{"abc123@.com",false},
											{"abc123@.com.com",false},
											{"abc()*@gmail.com",false},
											{"abc@%*.com",false},
											{"abc.@gmail.com",false},
											{"abc@abc@gmail.com",false},
											{"abc@gmail.com.aa.au",false}});

	
	}
	@Test
	public void givenEmail_WhenProper_ShouldReturnAsPerCondition() throws EmailException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateEmail(this.email);
		Assert.assertEquals(this.expectedResult,isValid);
	}
}
