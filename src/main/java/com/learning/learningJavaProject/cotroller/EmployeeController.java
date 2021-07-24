package com.learning.learningJavaProject.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.learningJavaProject.models.EmployeeModel;
import com.learning.learningJavaProject.response.ResponseMessage;
import com.learning.learningJavaProject.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping( value = "/add", method = RequestMethod.POST)
	public ResponseMessage addEmployee(@RequestBody EmployeeModel employeeModel)
	{
	   ResponseMessage response = empService.addEmployee(employeeModel);
	   return response;
	}
}
