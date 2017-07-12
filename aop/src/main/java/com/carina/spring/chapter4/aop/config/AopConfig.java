package com.carina.spring.chapter4.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.carina.spring.chapter4.aop"})
public class AopConfig {
	
}
