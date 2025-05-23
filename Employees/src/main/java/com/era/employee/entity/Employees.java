package com.era.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employees {
	@Id	
	private int empid;
	private String name;
	private String email;
	private double salary;
	private String birthPlace;
	private int deptId;
}
