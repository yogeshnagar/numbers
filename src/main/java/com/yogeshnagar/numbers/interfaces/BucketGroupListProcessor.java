package com.yogeshnagar.numbers.interfaces;

import java.util.List;

import com.yogeshnagar.numbers.core.beans.BucketGroup;
import com.yogeshnagar.numbers.core.beans.Response;

public interface BucketGroupListProcessor<E> {

	public Response<E> process(List<BucketGroup> bucketGroups);
	
}
