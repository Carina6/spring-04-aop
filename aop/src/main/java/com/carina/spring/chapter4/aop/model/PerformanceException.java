package com.carina.spring.chapter4.aop.model;

@SuppressWarnings("serial")
public class PerformanceException extends RuntimeException {
  public PerformanceException() {}
  
  public PerformanceException(String message) {
    super(message);
  }
}
