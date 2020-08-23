package com.yogeshnagar.numbers.interfaces;

import java.util.List;

import com.yogeshnagar.numbers.core.beans.Bucket;
import com.yogeshnagar.numbers.core.beans.Response;

public interface BucketListProcessor<E> {

	public Response<E> process(List<Bucket> buckets);
	
}
