package org.praksa.application;

import org.praksa.controller.DrzavaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.praksa.controller")
public class Application {
	
	 public static void main(String[] args) 
	 {
	        ApplicationContext ctx = SpringApplication.run(Application.class, args);
	        System.out.println(ctx.getDisplayName());

	        System.out.println("This is my first Spring Boot Example");

	 }

}