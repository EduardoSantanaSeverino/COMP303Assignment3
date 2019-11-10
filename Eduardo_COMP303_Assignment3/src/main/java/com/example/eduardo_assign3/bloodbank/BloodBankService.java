/**
 * 
 */
package com.example.eduardo_assign3.bloodbank;

import org.springframework.stereotype.Service;

import com.example.eduardo_assign3.generic.ServiceBaseAbstract;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

@Service
public class BloodBankService extends ServiceBaseAbstract<BloodBank> {

	public BloodBankService()
	{
		super();
	}
	
	public void SeedDatabase()
	{
		this.createItem(new BloodBank("Blood Bank of nort-america", "Progress, 34", "Scarborough", "802545654", "www.me.com", "info@me.com"));
		this.createItem(new BloodBank("Blood Bank of Sudam", "Alvarez, 34", "Scarborough 23", "80254999", "www.3456.com", "info@1234.com"));
	}
	
}
