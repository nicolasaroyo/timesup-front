package com.naroyo;

import java.util.ArrayList;
import java.util.List;

import org.teavm.flavour.templates.BindTemplate;

@BindTemplate("templates/fibonacci.html")
public class Fibonacci {
	private List<Integer> values = new ArrayList<>();

	public Fibonacci() {
		this.values.add(0);
		this.values.add(1);
	}

	public List<Integer> getValues() {
		return this.values;
	}

	public void next() {
		this.values.add(this.values.get(this.values.size() - 2) + this.values.get(this.values.size() - 1));
	}
}