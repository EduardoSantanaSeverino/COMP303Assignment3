/**
 * 
 */
package com.example.eduardo_assign3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 7, 2019
 */

@Controller
public class HomeController {

//	@ResponseBody
//	@RequestMapping("/home")
//	public String home()
//	{
//		return "index";
//	}
	
	@GetMapping("/home.html")
	public String all(Model model) {
	
		return "index";
	}

	
}
