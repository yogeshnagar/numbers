package com.yogeshnagar.numbers.processors.bucket;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.yogeshnagar.numbers.core.beans.Bucket;
import com.yogeshnagar.numbers.core.beans.Number;
import com.yogeshnagar.numbers.core.beans.Response;
import com.yogeshnagar.numbers.interfaces.BucketProcessor;
import com.yogeshnagar.numbers.processors.beans.OddEvenResponse;

@Service
public class OddEven implements BucketProcessor<OddEvenResponse> {

	@Override
	public Response<OddEvenResponse> process(Bucket bucket) {
		List<Number> evenNumbers = bucket.getNumbers().stream()
			.filter(number -> number.getValue().intValue() % 2 == 0)
			.collect(Collectors.toList());
		List<Number> oddNumbers = bucket.getNumbers().stream()
				.filter(number -> number.getValue().intValue() % 2 != 0)
				.collect(Collectors.toList());
		return new Response<>(new OddEvenResponse(oddNumbers, evenNumbers));
	}

}
