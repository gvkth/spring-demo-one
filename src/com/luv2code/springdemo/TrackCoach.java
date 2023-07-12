package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;
	
	
		
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Track coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
