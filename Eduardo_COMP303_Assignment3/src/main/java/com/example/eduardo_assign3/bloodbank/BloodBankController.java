/**
 * 
 */
package com.example.eduardo_assign3.bloodbank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eduardo_assign3.seeker.Seeker;
import com.example.eduardo_assign3.seeker.SeekerService;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

@RestController
public class BloodBankController {

	@Autowired
	private BloodBankService bloodBankService;
	
	@RequestMapping("/bloodbank")
	public List<BloodBank> getAll()
	{
		return this.bloodBankService.getAll();
	}
}