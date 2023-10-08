package com.example.Assignment1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLController {
	@RequestMapping("/name")
	public String display()
	{
		return "Bank name: HDFC";
	}
	@RequestMapping("/address")
	public String display1()
	{
		return "Address: Annanagar, Chennai";
	}
	
}
