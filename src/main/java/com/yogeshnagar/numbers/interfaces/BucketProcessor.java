package com.yogeshnagar.numbers.interfaces;

import com.yogeshnagar.numbers.core.beans.Bucket;
import com.yogeshnagar.numbers.core.beans.Response;

public interface BucketProcessor<E> {

	public Response<E> process(Bucket bucket);
	
}
