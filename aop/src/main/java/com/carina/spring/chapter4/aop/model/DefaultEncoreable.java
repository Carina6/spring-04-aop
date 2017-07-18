package com.carina.spring.chapter4.aop.model;

import org.springframework.stereotype.Component;

import com.carina.spring.chapter4.aop.Imodel.Encoreable;

@Component
public class DefaultEncoreable implements Encoreable {

	public void performEncore() {
		System.out.println("perform good");

	}

}
