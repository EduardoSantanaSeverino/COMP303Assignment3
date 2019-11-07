/**
 * 
 */
package com.example.eduardo_assign3.bloodstock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.eduardo_assign3.bloodbank.BloodBank;

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
public class BloodStockService {

	private List<BloodStock> list;
	
	public BloodStockService()
	{
		this.list = new ArrayList<BloodStock>();
		this.list.add(new BloodStock("Blood Group Passinated", "20", "2019-02-02", "Active"));
	}
	
	/** 
	 * @return the list
	 */
	public List<BloodStock> getAll() {
		return list;
	}
	
}