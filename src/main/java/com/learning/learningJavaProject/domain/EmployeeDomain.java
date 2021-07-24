package com.learning.learningJavaProject.domain;

import com.learning.learningJavaProject.models.EmployeeModel;
import com.learning.learningJavaProject.response.ResponseMessage;

public interface EmployeeDomain {
	
	ResponseMessage addEmployee(EmployeeModel employeeModel);

}
