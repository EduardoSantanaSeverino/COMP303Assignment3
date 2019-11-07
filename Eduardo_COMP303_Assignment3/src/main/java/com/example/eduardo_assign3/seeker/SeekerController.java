/**
 * 
 */
package com.example.eduardo_assign3.seeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value = "/seekers", method = RequestMethod.GET)
	public List<Seeker> getAll()
	{
		return this.seekerService.getAll();
	}
	
	@RequestMapping(value = "/seekers/{id}", method = RequestMethod.GET)
	public Seeker getItem(@PathVariable String id)
	{
		return this.seekerService.getItem(id);
	}
	
	@RequestMapping(value = "/seekers", method = RequestMethod.POST)
	public String createItem(@RequestBody Seeker item)
	{
		this.seekerService.createItem(item);
		return "Ok";
	}
	
	@RequestMapping(value = "/seekers/{id}", method = RequestMethod.PUT)
	public String updateItem(@PathVariable String id, @RequestBody Seeker item)
	{
		this.seekerService.updateItem(id, item);
		return "Ok";
	}
	
	@RequestMapping(value = "/seekers/{id}", method = RequestMethod.DELETE)
	public String deleteItem(@PathVariable String id)
	{
		this.seekerService.deleteItem(id);
		return "Ok";
	}
	
}
