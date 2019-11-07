/**
 * 
 */
package com.example.eduardo_assign3.seeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

@RestController
public class SeekerController {
	
	@Autowired
	private SeekerService seekerService;
	
	@RequestMapping("/seekers")
	public List<Seeker> getAll()
	{
		return this.seekerService.getAll();
	}
	
}
