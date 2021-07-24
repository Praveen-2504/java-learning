package com.learning.learningJavaProject.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.learningJavaProject.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> { 

}
