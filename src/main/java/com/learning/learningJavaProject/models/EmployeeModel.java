package com.learning.learningJavaProject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {
	
	private String empId;
	
	private String empName;
	
	private String empSalary;
	
	private String company;
	
	private String address;
}
