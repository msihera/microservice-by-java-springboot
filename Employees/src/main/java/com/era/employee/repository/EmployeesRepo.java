package com.era.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.era.employee.entity.Employees;

@Repository
public interface EmployeesRepo extends JpaRepository<Employees, Integer>{

}
