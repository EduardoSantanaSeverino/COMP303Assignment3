package com.example.eduardo_assign3;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.eduardo_assign3.bloodbank.BloodBankService;
import com.example.eduardo_assign3.bloodstock.BloodStockService;
import com.example.eduardo_assign3.seeker.SeekerService;

@SpringBootApplication
public class SpringBootEduardoAssign3Appplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEduardoAssign3Appplication.class, args);
		System.out.println("REST service started");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
	}
	
	@Bean
	public ApplicationRunner booksInitializer
	(
			SeekerService seekerService,
			BloodBankService bloodBankService,
			BloodStockService bloodStockService
	) 
	{
		return (args) -> 
		{
			seekerService.SeedDatabase();
			bloodBankService.SeedDatabase();
			bloodStockService.SeedDatabase();
		};
	}
	
}
