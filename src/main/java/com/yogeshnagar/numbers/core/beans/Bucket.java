package com.yogeshnagar.numbers.core.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bucket implements Item {

	private List<Number> numbers;
	
	public Bucket(Number... numbers) {
		this.numbers = Arrays.asList(numbers).stream().collect(Collectors.toList());
	}
	
	public List<Number> getNumbers() {
		return numbers;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Bucket) {
			return numbers.equals(((Bucket)o).numbers);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return numbers.hashCode();
	}
	
	@Override
	public String toString() {
		return numbers.stream().map(Number::toString).collect(Collectors.joining(","));
	}

}
