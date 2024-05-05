package com.duytb.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo2Application.class, args);
		Outfit outfit = context.getBean(Outfit.class);
		System.out.println("Instance: " +outfit);
		outfit.wear();
	}
}
