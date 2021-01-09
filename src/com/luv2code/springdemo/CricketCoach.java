package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;	
	
	private String emaiAdd, phone;
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// our setter method
	// since the setter name is setFortuneService then in configuration
	// File u should have the DI id as fortuneService
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	public void setEmailAddress(String email) {
		emaiAdd = email;
		System.out.println(emaiAdd);
	}
	
	public void setPhoneNo(String phone) {
		this.phone = phone;
		System.out.println(phone);
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
