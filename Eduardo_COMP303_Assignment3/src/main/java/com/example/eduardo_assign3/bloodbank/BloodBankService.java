/**
 * 
 */
package com.example.eduardo_assign3.bloodbank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.eduardo_assign3.seeker.Seeker;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

@Service
public class BloodBankService {

	private List<BloodBank> list;
	
	public BloodBankService()
	{
		this.list = new ArrayList<BloodBank>();
		this.list.add(new BloodBank("Blood Bank of nort-america", "Progress, 34", "Scarborough", "802545654", "www.me.com", "info@me.com"));
	}
	
	/** 
	 * @return the list
	 */
	public List<BloodBank> getAll() {
		return list;
	}
	
		
}
