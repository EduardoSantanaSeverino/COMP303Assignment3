/**
 * 
 */
package com.example.eduardo_assign3.seeker;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 8, 2019
 */

@Controller
public class SeekerController 
{

    @Autowired
	private SeekerService seekerService;
	
	@GetMapping("/seekers")
	public String getAll(Model model, HttpServletRequest request) 
	{
		String error_message = getErrorMessage(request);
		String info_message = getInfoMessage(request);
		List<Seeker> items = this.seekerService.getAll();
		model.addAttribute("items", items);
		model.addAttribute("error_message", (error_message == "null" ? "" : error_message));
		model.addAttribute("info_message", (info_message == "null" ? "" : info_message));
		return "seeker/list";
	}
	
	@GetMapping("/seekers/update/{id}")
	public String updateItem(@PathVariable int id, Model model)
	{
		Seeker item = this.seekerService.getItem(id);
		model.addAttribute("item",item);
		return "seeker/update";
	}
	
	@RequestMapping(value = "/seekers/update", method = RequestMethod.POST)
    public ModelAndView updateItem(@ModelAttribute Seeker item, HttpServletRequest request)
	{
	
		this.seekerService.updateItem(item.getId(), item);
		boolean isValid = item != null;
		
		if(isValid)
		{
			request.getSession().setAttribute("info_message", "Information Saved Correctly!");
		}
		else
		{
			request.getSession().setAttribute("error_message", "There were some errors trying to save your information, please talk to administrators at +1 (471) 562 - 5656 !");
		}
		return new ModelAndView("redirect:/seekers", new HashMap<>());	

	}
	
	@GetMapping("/seekers/create")
	public String createItem(Model model)
	{
		return "seeker/create";
	}

	@RequestMapping(value = "/seekers/create", method = RequestMethod.POST)
    public ModelAndView createItem(@ModelAttribute Seeker item, HttpServletRequest request)
	{
	
		this.seekerService.createItem(item);
		boolean isValid = item != null;
		
		if(isValid)
		{
			request.getSession().setAttribute("info_message", "Information Saved Correctly!");
		}
		else
		{
			request.getSession().setAttribute("error_message", "There were some errors trying to save your information, please talk to administrators at +1 (471) 562 - 5656 !");
		}
		return new ModelAndView("redirect:/seekers", new HashMap<>());	

	}
	
	@GetMapping("/seekers/details/{id}")
	public String detailsItem(@PathVariable int id, Model model)
	{
		Seeker item = this.seekerService.getItem(id);
		model.addAttribute("item",item);
		return "seeker/details";
	}
		
	@RequestMapping(value = "seekers/delete/{id}", method = RequestMethod.POST)
	public ModelAndView deleteItem(@PathVariable int id, HttpServletRequest request)
	{

		this.seekerService.deleteItem(id);
		
		request.getSession().setAttribute("info_message", "Seeker Deleted Correctly!");
		
		return new ModelAndView("redirect:/seekers", new HashMap<>());
		
	}
	
	private String getErrorMessage(HttpServletRequest request)
	{
		Object retVal = request.getSession().getAttribute("error_message");
		request.getSession().setAttribute("error_message", "");
		return String.valueOf(retVal);
	}
	
	private String getInfoMessage(HttpServletRequest request)
	{
		Object retVal = request.getSession().getAttribute("info_message");
		request.getSession().setAttribute("info_message", "");
		return String.valueOf(retVal);
	}
	
}
