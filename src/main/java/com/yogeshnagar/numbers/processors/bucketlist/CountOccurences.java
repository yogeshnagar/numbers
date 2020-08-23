package com.yogeshnagar.numbers.processors.bucketlist;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.yogeshnagar.numbers.core.beans.Bucket;
import com.yogeshnagar.numbers.core.beans.Number;
import com.yogeshnagar.numbers.core.beans.Response;
import com.yogeshnagar.numbers.interfaces.BucketListProcessor;
import com.yogeshnagar.numbers.processors.beans.OccurencesResponse;

@Service
public class CountOccurences implements BucketListProcessor<OccurencesResponse> {

	@Override
	public Response<OccurencesResponse> process(List<Bucket> buckets) {
		Map<Number, Long> counts = 
				buckets.stream().map(Bucket::getNumbers)
					.flatMap(List::stream)
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return new Response<OccurencesResponse>(new OccurencesResponse(counts));
	}

}
