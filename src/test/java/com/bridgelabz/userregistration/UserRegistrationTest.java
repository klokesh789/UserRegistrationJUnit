package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration register = new UserRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validateName.validate("Lokesh");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateName.validate("lokesh");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateName.validate("lok");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validateName.validate("Kotte");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateName.validate("kotte");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateName.validate("lo");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validateEmail.validate("abc@gmail.com");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateEmail.validate(".abc@gmail.com");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validatePhoneNumber.validate("91799577289");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
		boolean isValid4 = register.validatePhoneNumber.validate("56544");
		Assert.assertFalse(isValid4);
	}
	@Test
	public void givenPassword_When1UpperCase_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validatePassword.validate("aBd5gd2@g");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validatePassword.validate("aBd5gd2@g");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validatePassword.validate("b31fr7skd");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenEmail_WhenHaveConsecutiveDots_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateEmail.validate("abc..23@gmail.com");
		Assert.assertFalse(isValid);
	}}
