package com.yogeshnagar.numbers.core.beans;

public class Response<E> {

	private E value;
	
	public Response(E value) {
		this.value = value;
	}
	
	public E get() {
		return value;
	}
	
	public String toString() {
		return value.toString();
	}
	
}
