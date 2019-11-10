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

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

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
	
	/**
	 * This method is used to load the in memory lists. 
	 * inserting the default objects lists. it is called 
	 * SeedDatabase because it is making the seed.
	 */
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
