package com.luv2code.springdemo;

public class SuperCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		
		return "I'm supercoach? fuck you";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}
	
}
