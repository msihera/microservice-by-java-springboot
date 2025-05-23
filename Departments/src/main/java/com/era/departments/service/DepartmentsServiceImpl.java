package com.era.departments.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.era.departments.dto.DepartmentsDTO;
import com.era.departments.entity.Departments;
import com.era.departments.mapper.DepartmentsMapper;
import com.era.departments.repository.DepartmentsRepo;

@Service
public class DepartmentsServiceImpl implements DepartmentsService{
	@Autowired
	DepartmentsMapper mapper;
	
	@Autowired
	DepartmentsRepo repo;

	@Override
	public DepartmentsDTO saveDepartment(DepartmentsDTO dto) {
		Departments entity= mapper.toEntity(dto);
        Departments saved= repo.save(entity);
		return mapper.toDto(saved);
	}

	@Override
	public List<DepartmentsDTO> getAllDepartments() {
		return repo.findAll().stream().
				map(mapper::toDto).
				collect(Collectors.toList());
	}

}
