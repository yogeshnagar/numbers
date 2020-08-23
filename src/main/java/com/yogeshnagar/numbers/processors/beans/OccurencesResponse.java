package com.yogeshnagar.numbers.processors.beans;

import java.util.Map;
import java.util.stream.Collectors;

import com.yogeshnagar.numbers.core.beans.Number;

public class OccurencesResponse {

	private Map<Number, Long> occurences;
	
	public OccurencesResponse(Map<Number, Long> occurences) {
		this.occurences = occurences;
	}

	public Map<Number, Long> getOccurences() {
		return occurences;
	}
	
	public String toString() {
		return occurences.entrySet().stream().map(ocur -> ocur.getKey() + "->" + ocur.getValue()).collect(Collectors.joining(","));
	}
	
}
