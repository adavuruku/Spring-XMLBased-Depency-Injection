package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTheSetterInjection {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container method (1)
		
		//Coach theCoach = context.getBean("myCricketCoach", Coach.class);
		//or this (2)
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// the difference the first is match to interface Coach - using the method
		// you can only access the methods or properties defined in the interface
		// Spring will contruct base on the Interface
		// but using the second method spring match the object to the class and give one access
		// to the literal injection (in CricketCoach) as well as the methods in the Coach Interface
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		
		System.out.println(theCoach.getEmaiAdd());
		
		System.out.println(theCoach.getPhone());
		
		// close the context
		context.close();
	}

}







