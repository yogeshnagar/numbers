package com.yogeshnagar.numbers;

import java.util.List;
import java.util.stream.Collectors;

import com.yogeshnagar.numbers.core.beans.Bucket;
import com.yogeshnagar.numbers.core.beans.BucketGroup;
import com.yogeshnagar.numbers.interfaces.Provider;
import com.yogeshnagar.numbers.processors.bucketlist.CountOccurences;
import com.yogeshnagar.numbers.providers.EMProvider;

public class Main {

	public static void main2(String[] args) {
		
		Provider provider = new EMProvider();
		
		List<BucketGroup> bucketGroup = provider.provide();
		
		List<Bucket> buckets = bucketGroup.stream().map(bg -> bg.getBuckets().get(0)).collect(Collectors.toList());
		
		System.out.println(new CountOccurences().process(buckets));

	}

}
