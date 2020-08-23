package com.yogeshnagar.numbers.core.beans;

public class Number implements Comparable<Number>, Item {
	
	private Integer value;
	
	public Number(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Number) {
			return value.equals(((Number)o).value);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public int compareTo(Number o) {
		return value.compareTo(o.value);
	}
	
	@Override
	public String toString() {
		return value.toString();
	}

}
