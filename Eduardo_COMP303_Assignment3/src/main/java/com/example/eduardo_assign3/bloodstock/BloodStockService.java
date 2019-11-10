/**
 * 
 */
package com.example.eduardo_assign3.bloodstock;

import org.springframework.stereotype.Service;

import com.example.eduardo_assign3.generic.ServiceBaseAbstract;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

/**
 * @param bloodGroup
 * @param quantity
 * @param bestBefore
 * @param status
 */

@Service
public class BloodStockService extends ServiceBaseAbstract<BloodStock> 
{
	public BloodStockService()
	{
		super();
	}
	
	public void SeedDatabase()
	{
		this.createItem(new BloodStock("Blood Group Passinated", "20", "2019-02-02", "Active"));
	}
}