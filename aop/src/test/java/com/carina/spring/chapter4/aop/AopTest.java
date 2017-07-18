package com.carina.spring.chapter4.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.carina.spring.chapter4.aop.Imodel.CompactDisc;
import com.carina.spring.chapter4.aop.Imodel.Encoreable;
import com.carina.spring.chapter4.aop.Imodel.Performance;
import com.carina.spring.chapter4.aop.config.AspectProfile;

import junit.framework.TestCase;

public class AopTest extends TestCase {
	
	private ApplicationContext context = new AnnotationConfigApplicationContext("com.carina.spring.chapter4.aop.config");
	
	public void testAop(){
		Performance sing = context.getBean(Performance.class);
		sing.perform();
	}
	
	public void testAopWithParams(){
		AspectProfile ap = context.getBean(AspectProfile.class);
		CompactDisc cd = context.getBean(CompactDisc.class);
		cd.playTrack(1);
		cd.playTrack(2);
		cd.playTrack(3);
		cd.playTrack(2);
		System.out.println("1:"+ ap.getPlayCount(1));
		System.out.println("2:"+ ap.getPlayCount(2));
		System.out.println("3:"+ ap.getPlayCount(3));
		System.out.println("4:"+ ap.getPlayCount(4));
	}
	
	public void testAopIntroduction(){
		Performance sing = context.getBean(Performance.class);
		((Encoreable)sing).performEncore();
	}

}
