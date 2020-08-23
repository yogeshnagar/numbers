package com.yogeshnagar.numbers.providers;

import static java.lang.Integer.parseInt;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.yogeshnagar.numbers.core.beans.Bucket;
import com.yogeshnagar.numbers.core.beans.BucketGroup;
import com.yogeshnagar.numbers.core.beans.Number;
import com.yogeshnagar.numbers.interfaces.Provider;

@Service("em")
public class EMProvider implements Provider {

	@Override
	public List<BucketGroup> provide() {
		List<BucketGroup> bucketGroups = new ArrayList<BucketGroup>();
		InputStream csvIS = 
				EMProvider.class.getResourceAsStream("/data/euromillions-draw-history.csv");
		try (Scanner scanner = new Scanner(csvIS);) {
			if (scanner.hasNextLine()) {
				scanner.nextLine();
			}
		    while (scanner.hasNextLine()) {
		    	bucketGroups.add(getBucketGroup(scanner.nextLine()));
		    }
		}
		return bucketGroups;
	}
	
	private BucketGroup getBucketGroup(String line) {
		String[] nums = line.split(",");
		return new BucketGroup(
					new Bucket(new Number(parseInt(nums[1])), new Number(parseInt(nums[2])), new Number(parseInt(nums[3])), new Number(parseInt(nums[4])), new Number(parseInt(nums[5]))),
					new Bucket(new Number(parseInt(nums[6])), new Number(parseInt(nums[7])))
				);
	}
	
}
