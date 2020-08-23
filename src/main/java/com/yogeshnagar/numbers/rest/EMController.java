package com.yogeshnagar.numbers.rest;

import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yogeshnagar.numbers.interfaces.Provider;
import com.yogeshnagar.numbers.processors.beans.EMOccurencesResponse;
import com.yogeshnagar.numbers.processors.beans.OccurencesResponse;
import com.yogeshnagar.numbers.processors.bucketlist.CountOccurences;

@RestController
@RequestMapping("/em")
public class EMController {
	
	@Autowired
	private Provider emProvider;
	
	@Autowired
	private CountOccurences countOccurences;
	
	private Function<Integer, OccurencesResponse> getOccurencesFunction = 
			(index) -> countOccurences.process(emProvider.provide().stream().map(bg -> bg.getBuckets().get(index)).collect(Collectors.toList())).get();

	@RequestMapping(method = RequestMethod.GET, path = "/occurences")
	public EMOccurencesResponse getOccurences() {
		OccurencesResponse firstBucket = getOccurencesFunction.apply(0);
		OccurencesResponse secondBucket = getOccurencesFunction.apply(1);
		return new EMOccurencesResponse(firstBucket, secondBucket);
	}
	
}
