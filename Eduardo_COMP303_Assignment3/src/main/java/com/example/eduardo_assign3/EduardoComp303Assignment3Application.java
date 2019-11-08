package com.example.eduardo_assign3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EduardoComp303Assignment3Application implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(EduardoComp303Assignment3Application.class, args);
		System.out.println("REST service started");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
	}

}
