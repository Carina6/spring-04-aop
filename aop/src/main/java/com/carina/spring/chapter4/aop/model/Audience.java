package com.carina.spring.chapter4.aop.model;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
	
	@Pointcut("execution(** com.carina.spring.chapter4.aop.model.Performance.perform(..))")
	public void performance() {}
	
	@Before("performance()")
	public void silenceCellPhone(){
		System.out.println("Silencing cell phone!");
	}
	
	@Before("performance()")
	public void takeSeats(){
		System.out.println("Taking seats!");
	}
	
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("CLAP CLAP CLAP!!!");
	}

	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Demanding a refund!");
	}
}
