package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration register = new UserRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean isValid = register.validateFirstName("Lokesh");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
		boolean isValid = register.validateFirstName("lokesh");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		boolean isValid = register.validateFirstName("lo");
		Assert.assertFalse(isValid);
	}
	
}