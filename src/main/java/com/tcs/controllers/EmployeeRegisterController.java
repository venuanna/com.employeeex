package com.tcs.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tcs.dao.IEmployeeOperations;
import com.tcs.pojo.Employee;

@Controller
public class EmployeeRegisterController {

	@Autowired
	private IEmployeeOperations register; 
	
	
	@RequestMapping(value = "/empreg", method = RequestMethod.POST)
	public String registerEmp(@ModelAttribute("register") Employee employee, Model model) {

		System.out.println("Am in the register method");
		System.out.println("Venu modified");

		employee.setLocked(false);
		employee.setCount(0);
		Boolean regstatus=register.registerEmp(employee);
		if(regstatus){
			model.addAttribute("message","Successfully registered");
			return "Success";
		}else{
			model.addAttribute("message","Register failure");
			return "Register";
		}
	}
	
	@RequestMapping(value="/gotoRegister",method=RequestMethod.GET)
	public String gotoRegister(){
		System.out.println("public String gotoRegister()");
		return "Register";
	}
public void m1()
{
	System.out.println("hi");
}
}
