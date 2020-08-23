package com.yogeshnagar.numbers.interfaces;

import com.yogeshnagar.numbers.core.beans.BucketGroup;
import com.yogeshnagar.numbers.core.beans.Response;

public interface BucketGroupProcessor<E> {

	public Response<E> process(BucketGroup bucketGroup);
	
}
