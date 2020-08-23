package com.yogeshnagar.numbers.processors;

import java.util.List;

import com.yogeshnagar.numbers.core.beans.Item;
import com.yogeshnagar.numbers.core.exceptions.ProcessorNotSupportedException;

public interface Processor<E> {

	public default E process(Item item) {
		throw new ProcessorNotSupportedException();
	}
	
	public default E process(List<Item> item) {
		throw new ProcessorNotSupportedException();
	}
	
}
