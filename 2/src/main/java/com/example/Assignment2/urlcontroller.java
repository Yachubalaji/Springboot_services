package com.example.Assignment2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class urlcontroller {
	@RequestMapping("/branches")
	public ModelAndView details()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("a","Sarjapur");
		model.addObject("b","KR puram");
		model.addObject("c","Whitefield");
		model.addObject("d","MG Road");
		model.addObject("e","Akshay Nagar");
		model.addObject("f","Anekal");
		model.addObject("g","Chandra Layout");
		model.addObject("h","HSR Layout");
		model.addObject("i","KH Road");
		model.addObject("j","JC Road");
		model.setViewName("Details");
		return model;
	}
	@RequestMapping("/services")
	public String service()
	{
		return "Service";
	}
	
}
