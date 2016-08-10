package org.praksa.application;

import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.praksa.controller.DrzavaController;
import org.praksa.db.DBConnection;
import org.praksa.model.Drzava;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.praksa.controller", "org.praksa.dao"})

public class Application {
	
	 public static void main(String[] args) 
	 {
	        ApplicationContext ctx = SpringApplication.run(Application.class, args);
	        System.out.println(ctx.getDisplayName());
	        
	        
	        System.out.println("This is my first Spring Boot Example faaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad");

	 }

}
