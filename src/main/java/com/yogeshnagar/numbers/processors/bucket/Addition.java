package com.yogeshnagar.numbers.processors.bucket;

import org.springframework.stereotype.Service;

import com.yogeshnagar.numbers.core.beans.Bucket;
import com.yogeshnagar.numbers.core.beans.Number;
import com.yogeshnagar.numbers.core.beans.Response;
import com.yogeshnagar.numbers.interfaces.BucketProcessor;

@Service
public class Addition implements BucketProcessor<Integer> {
	
	public Response<Integer> process(Bucket bucket) {
		return new Response<>(bucket.getNumbers().stream().mapToInt(Number::getValue).sum());
	}

}
