package com.yogeshnagar.numbers.core.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BucketGroup implements Item {
	
	private List<Bucket> buckets;
	
	public BucketGroup(Bucket... buckets) {
		this.buckets = Arrays.asList(buckets).stream().collect(Collectors.toList());
	}

	public List<Bucket> getBuckets() {
		return buckets;
	}
	
	@Override
	public String toString() {
		return buckets.stream().map(Bucket::toString).collect(Collectors.joining("-"));
	}

}
