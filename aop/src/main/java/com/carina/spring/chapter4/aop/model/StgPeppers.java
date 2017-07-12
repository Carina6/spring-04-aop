package com.carina.spring.chapter4.aop.model;

import org.springframework.stereotype.Component;

import com.carina.spring.chapter4.aop.Imodel.CompactDisc;

@Component
public class StgPeppers implements CompactDisc {

	public void playTrack(int number) {
		System.out.println(number);
	}

}
