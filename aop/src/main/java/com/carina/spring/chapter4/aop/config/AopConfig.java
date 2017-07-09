package com.carina.spring.chapter4.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.carina.spring.chapter4.aop.model.Audience;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.carina.spring.chapter4.aop.model"})
public class AopConfig {
	
//	@Bean
//	public Audience audience(){
//		return new Audience();
//	}
	
}
