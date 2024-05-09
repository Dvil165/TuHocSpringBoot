package com.duytb.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication(scanBasePackages = {"com.duytb.demo2.other_package",
		"com.duytb.demo2"})
public class Demo2Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo2Application.class, args);
		Human human = (Human)context.getBean("human");
		System.out.println("this is human" +human);
		human.outfit.wear();
	}
}
