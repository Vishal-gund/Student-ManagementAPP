package com.practice.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.practice.entities.Student;
import com.practice.service.Services;



@Controller
public class StdController {
	@Autowired
	private Services service;
	
	
	@GetMapping("/home")
	public String homePage() {
		return "home";
	}
	
	
	@GetMapping("/register")
	public String registerForm(Model model) {
		model.addAttribute("std", new Student());
		return "register";
	}
	
	

	@PostMapping("/register/save")
	
	public String addStdldata(@ModelAttribute("std") Student std, RedirectAttributes redirectAttributes) {
		
		
		boolean status = service.saveStudent(std);
		
		if(status) {
			redirectAttributes.addFlashAttribute("msg", "Student registered successfully!");
	    }
		else {
			redirectAttributes.addFlashAttribute("msg","Student Already Registered !");
		}

		return "redirect:/register";
	}
	
	
	@GetMapping("/viewData")  // handele the broweser reqst http.../viewData
	public String showData(Model model) {  // send data to controller page
		List <Student> list = service.geAllStudent();  // fetch data from db
	
		model.addAttribute("students", list);  // shared data to html page 
		return "viewData";	 // here we send data we need to create this html page 
	}
	
	
	
	
	
}
