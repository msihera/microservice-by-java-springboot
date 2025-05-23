package com.era.oracledb.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {
	@Id	
	private int empid;
	private String name;
	private String email;
	private double salary;
	private String birthPlace;
}
