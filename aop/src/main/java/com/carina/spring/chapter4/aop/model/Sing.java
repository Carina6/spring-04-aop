package com.carina.spring.chapter4.aop.model;

import org.springframework.stereotype.Component;

import com.carina.spring.chapter4.aop.Imodel.Performance;

@Component
public class Sing implements Performance{

	public void perform() throws PerformanceException {
		System.out.println("I'm singing a song!");
	}

}
