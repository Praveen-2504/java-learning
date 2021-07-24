package com.learning.learningJavaProject.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.learningJavaProject.domain.EmployeeDomain;
import com.learning.learningJavaProject.models.EmployeeModel;
import com.learning.learningJavaProject.response.ResponseMessage;
import com.learning.learningJavaProject.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDomain empDomain;

	@Override
	public ResponseMessage addEmployee(EmployeeModel employeeModel) {
		ResponseMessage response = empDomain.addEmployee(employeeModel);
		return response;
	}

}
