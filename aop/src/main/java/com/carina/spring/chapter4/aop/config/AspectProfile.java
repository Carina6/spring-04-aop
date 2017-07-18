package com.carina.spring.chapter4.aop.config;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.carina.spring.chapter4.aop.Imodel.Encoreable;
import com.carina.spring.chapter4.aop.model.DefaultEncoreable;

@Aspect
@Component
public class AspectProfile {
	
	private Map<Integer, Integer> trackCount = new HashMap<Integer, Integer>();
	
	@DeclareParents(value="com.carina.spring.chapter4.aop.Imodel.Performance+",defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;
	
	@Pointcut("execution(** com.carina.spring.chapter4.aop.Imodel.Performance.perform(..))")
	public void performance() {}

	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		System.out.println("Silencing cell phone!");
		System.out.println("Taking seats!");
		try {
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			System.out.println("Demanding a refund!");
		}
	}
	
	@Pointcut("execution(** com.carina.spring.chapter4.aop.Imodel.CompactDisc.playTrack(int)) && args(trackNumber)")
	public void trackPlayed(int trackNumber){}
	
	@Before("trackPlayed(trackNumber)")
	public void countTrack(int trackNumber){
		int currentCount = getPlayCount(trackNumber);
		trackCount.put(trackNumber, currentCount+1);
	}

	public int getPlayCount(int trackNumber) {
		return trackCount.containsKey(trackNumber)?trackCount.get(trackNumber):0;
	}
}
