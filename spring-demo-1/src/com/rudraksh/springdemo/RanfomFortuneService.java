package com.rudraksh.springdemo;

import java.util.Random;

public class RanfomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data = {
			"Jay Yogeshwar",
			"Jay Swaminarayan",
			"Jay Mataji",
			"Om namah Shivay"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		return theFortune;
	}

}
