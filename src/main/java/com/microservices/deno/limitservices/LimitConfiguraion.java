package com.microservices.deno.limitservices;

public class LimitConfiguraion {
	private int maximum;
	private int minimum;
	
	public LimitConfiguraion() { }
	
	public LimitConfiguraion(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	public int getMaximum() {
		return maximum;
	}
	
	public int getMinimum() {
		return minimum;
	}
		
}
