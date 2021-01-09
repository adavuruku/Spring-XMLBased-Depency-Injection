package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	//trackCoach will use FortuneTwo Service
	//inject fortuneTwo Service Here
	//this bean can as well implements the method in coach class
	//on its own way just like BaseballCoach implements getDailyWorkout
	
	//fortuneTwoService to be Injected
	private FortuneTwoService fortuneService;

	//adding a public constructor so one 
	//can define Object without using IOC or the Injection
	//this is not necessary if u don't intend to
	//create pojo objects
	public TrackCoach() {
		
	}
	
	//inject the service as Constructor Injection
	public TrackCoach(FortuneTwoService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Just Do It: " + fortuneService.getDailyRoutine();
	}

	@Override
	public String getDailyFortune() {
		return "Message : " + fortuneService.getFortuneTwo();
	}

}










