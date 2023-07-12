package com.luv2code.springdemo;

public class TableTennisCoach implements Coach {
	//define a private field for the dependency
		private FortuneService fortuneService;
		
	
		
	public TableTennisCoach() {
		System.out.println("TTCoach: inside no-arg constructor");
		}

	public TableTennisCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice serve 100 times";
	}

	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
