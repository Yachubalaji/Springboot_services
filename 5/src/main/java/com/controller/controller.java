package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.EmployeeTable;
import com.model.EmployeeTableRepository;

@RestController
public class controller {
	@Autowired
	EmployeeTableRepository accountRepository;
	
	@RequestMapping(value="display/{id}",method=RequestMethod.GET)
	public Optional<EmployeeTable> gettid(@PathVariable("id")Long id)
	{
	   return accountRepository.findById(id);
	}
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public String addAccount(@ModelAttribute("id") Long id,@ModelAttribute("name") String name,@ModelAttribute("email") String email,@ModelAttribute("location") String location)
	{
		EmployeeTable a=new EmployeeTable(id,name,email,location);
		accountRepository.save(a);
		return "<html><body bgcolor='yellow'>Added Account Successfully<br><a href='/displayAll'>View All Accounts</a></body></html>";
	}
	@RequestMapping(value="/del/{id}",method=RequestMethod.DELETE)
	public String del(@PathVariable("id")Long id)
	{
		accountRepository.deleteById(id);
		return "deleted";
		
	}
	@RequestMapping(value="/put/{id}",method=RequestMethod.PUT)
	public String edit(@ModelAttribute("id") Long id,@ModelAttribute("name") String name ,@ModelAttribute("email") String email,@ModelAttribute("location") String location)
	{
		EmployeeTable a=new EmployeeTable(id,name,email,location);
		accountRepository.save(a);
		return "<html><body bgcolor='yellow'>Added Account Successfully<br><a href='/displayAll'>View All Accounts</a></body></html>";
		
	}
	

}
