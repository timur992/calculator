package com.calculator.arithmetics;

public class Calculator {
	
	public double addTwoNumbers(double numOne, double numTwo) {
		return (numOne + numTwo);
	}
	
	public double deductTwoNumbers(double numOne, double numTwo) {
		return (numOne - numTwo);
	}
	
	public double multiplyTwoNumbers(double numOne, double numTwo) {
		return (numOne * numTwo);
	}

	public double divideTwoNumbers(double numOne, double numTwo) {
		
		double resultOfDivision = 0;
		
		if(numTwo == 0) {
			System.out.println("**********Running Zero Division Logic************");
			System.out.println("You cant Divide by Zero!!!");
			return resultOfDivision;
		} else {
			resultOfDivision = numOne / numTwo;
		}
		
		return resultOfDivision;
	}
}
