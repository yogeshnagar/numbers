package com.yogeshnagar.numbers.processors.beans;

public class EMOccurencesResponse {

	private OccurencesResponse firstBucket;
	
	private OccurencesResponse secondBucket;
	
	public EMOccurencesResponse(OccurencesResponse firstBucket, OccurencesResponse secondBucket) {
		this.firstBucket = firstBucket;
		this.secondBucket = secondBucket;
	}

	public OccurencesResponse getFirstBucket() {
		return firstBucket;
	}

	public OccurencesResponse getSecondBucket() {
		return secondBucket;
	}
	
}
