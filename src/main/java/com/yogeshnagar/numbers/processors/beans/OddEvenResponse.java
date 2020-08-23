package com.yogeshnagar.numbers.processors.beans;

import java.util.List;

import com.yogeshnagar.numbers.core.beans.Number;

public class OddEvenResponse {
	
	private List<Number> oddNumbers;
	
	private List<Number> evenNumbers;
	
	public OddEvenResponse(List<Number> oddNumbers, List<Number> evenNumbers) {
		this.oddNumbers = oddNumbers;
		this.evenNumbers = evenNumbers;
	}

	public List<Number> getOddNumbers() {
		return oddNumbers;
	}

	public List<Number> getEvenNumbers() {
		return evenNumbers;
	}

}
