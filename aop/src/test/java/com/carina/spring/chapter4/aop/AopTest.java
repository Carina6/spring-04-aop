package com.carina.spring.chapter4.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.carina.spring.chapter4.aop.model.Performance;

import junit.framework.TestCase;

public class AopTest extends TestCase {
	
	public void aopTest(){
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext("com.carina.spring.chapter4.aop.config");
		Performance sing = context.getBean(Performance.class);
		sing.perform();
	}

}
