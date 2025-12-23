package com.SpringFirst.SpringBootBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springfirst.SpringBootBasic", "controller"})



public class App {
    public static void main(String[] args) {
    	 System.out.println("Spring Boot Application Started...");
         SpringApplication.run(App.class, args);
    }
}
