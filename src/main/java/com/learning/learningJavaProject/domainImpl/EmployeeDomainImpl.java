package com.learning.learningJavaProject.domainImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.icbl.ems.utilities.CommonUtility;
import com.learning.learningJavaProject.domain.EmployeeDomain;
import com.learning.learningJavaProject.entities.Employee;
import com.learning.learningJavaProject.models.EmployeeModel;
import com.learning.learningJavaProject.repository.EmployeeRepository;
import com.learning.learningJavaProject.response.ResponseMessage;

@Component
public class EmployeeDomainImpl implements EmployeeDomain {
	
	@Autowired
	private EmployeeRepository empRepo;	
	
	@Override
	public ResponseMessage addEmployee(EmployeeModel employeeModel) {
		Employee employee = new Employee();
		employee =CommonUtility.map(employeeModel, employee);
		empRepo.save(employee);
		ResponseMessage response = new ResponseMessage("200", "Employee details added successfully...");
		return response;
	}

}
