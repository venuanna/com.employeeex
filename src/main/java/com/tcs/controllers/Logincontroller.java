package com.tcs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tcs.dao.IEmployeeOperations;
import com.tcs.pojo.Employee;
import com.tcs.validations.Validations;

@Controller
public class Logincontroller {

	@Autowired()
	private IEmployeeOperations employeeOperations;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@ModelAttribute("registration") Employee employee, Model model) {

		System.out.println("Am in the login method");

		System.out.println(employee.getEemail());

		Validations validation = new Validations();
		/*validation.validateEmail(employee.getEemail());
		validation.validatePassword(employee.getPassword());*/

		if (validation.validateEmail(employee.getEemail()) && validation.validatePassword(employee.getPassword())) {
			Boolean loginStatus = employeeOperations.loginUser(employee);
			if (loginStatus) {
				model.addAttribute("message", "Successfully logged in");
				return "Login";
			} else {
				model.addAttribute("message", "Login Failure");
				return "Login";
			}
		} else {
			model.addAttribute("message", "Please Enter Username or Passowrd");
			return "Login";
		}
	}
}
