package com.example.Fibonacci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FibonacciApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(FibCalculator.class, args);
		System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
		var Fib = ctx.getBean(FibCalculator.class);
		System.out.println(Fib);
	}

}
