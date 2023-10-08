package com.controller;

import java.util.List;
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
public class controllerclass {
@Autowired
EmployeeTableRepository accountRepository;

@RequestMapping("/displayAll")
public Iterable<EmployeeTable> getAllAccounts(){
	return accountRepository.findAll();
}
@RequestMapping(value="display/{id}",method=RequestMethod.GET)
public Optional<EmployeeTable> gettid(@PathVariable("id")Long id)
{
   return accountRepository.findById(id);
}
@RequestMapping(value="/addAccount",method=RequestMethod.POST)
public String addAccount(@ModelAttribute("id") Long id,@ModelAttribute("name") String name,@ModelAttribute("email") String email,@ModelAttribute("location") String location)
{
	EmployeeTable a=new EmployeeTable(id,name,email,location);
	accountRepository.save(a);
	return "<html><body bgcolor='yellow'>Added Account Successfully<br><a href='/displayAll'>View All Accounts</a></body></html>";
}
}