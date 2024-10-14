package com.calculator.arithmetics;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorTests {
	
	double number1 = 152.50;
	double number2 = 30.5;
	double zeroNumber = 0;
	
	Calculator calculator = new Calculator();
	
	@Test
	public void addTwoNumbersTest() {
		double actual = calculator.addTwoNumbers(number1, number2);
		assertEquals(183.00, actual);
	}

	@Test
	public void deductingTwoNumbersTest() {
		double actual = calculator.deductTwoNumbers(number1, number2);
		assertEquals(122.00, actual);
	}
	
	@Test
	public void multiplyingTwoNumbersTest() {
		double actual = calculator.multiplyTwoNumbers(number1, number2);
		assertEquals(4651.25, actual);
	}
	
	@Test
	public void dividingTwoNumbersTest() {
		double actual = calculator.divideTwoNumbers(number1, number2);
		assertEquals(5.00, actual);
	}
	
	@Test
	public void devidingByZeroTest() {
		double actual = calculator.divideTwoNumbers(number1, zeroNumber);
		assertEquals(0.00, actual);
	}
}
