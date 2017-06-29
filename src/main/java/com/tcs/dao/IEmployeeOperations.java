package com.tcs.dao;

import com.tcs.pojo.Employee;

public interface IEmployeeOperations {

	public boolean loginUser(Employee employee);
	public boolean registerEmp(Employee employee);
}
