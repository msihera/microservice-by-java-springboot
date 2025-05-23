package com.era.departments.service;

import java.util.List;

import com.era.departments.dto.DepartmentsDTO;

public interface DepartmentsService {
	public DepartmentsDTO saveDepartment(DepartmentsDTO dto);
	
	public List<DepartmentsDTO> getAllDepartments();

}
