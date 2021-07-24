package com.learning.learningJavaProject.entities;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Table(name = "employee")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	private UUID id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "salary", nullable = false)
	private String salary;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "department", nullable = true)
	private String department;
}
