package com.learning.learningJavaProject.services;

import com.learning.learningJavaProject.models.EmployeeModel;
import com.learning.learningJavaProject.response.ResponseMessage;

public interface EmployeeService {
	
	ResponseMessage addEmployee(EmployeeModel employeeModel);

}
