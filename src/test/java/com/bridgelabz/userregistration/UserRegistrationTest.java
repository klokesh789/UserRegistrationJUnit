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
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean isValid = register.validateFirstName("Kotte");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean isValid = register.validateFirstName("kotte");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		boolean isValid = register.validateFirstName("ko");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean isValid = register.validateEmail("abc@gmail.com");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenEmail_When_ShouldReturnFalse() {
		boolean isValid = register.validateEmail(".abc@gmail.com");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPhoneNumber_When_ShouldReturnTrue() {
		boolean isValid = register.validatePhoneNumber("919851234549");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPhoneNumber_When_ShouldReturnFalse() {
		boolean isValid = register.validatePhoneNumber("3564");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPassword_When_ShouldReturnTrue() {
		boolean isValid = register.validatePassword("bAe7ge2@1");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenOneUpperCase_ShouldReturnTrue() {
		boolean isValid = register.validatePassword("bAe7ge2@1");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_When_ShouldReturnFalse() {
		boolean isValid = register.validatePassword("c81km0skd");
		Assert.assertFalse(isValid);
	}
	
}
