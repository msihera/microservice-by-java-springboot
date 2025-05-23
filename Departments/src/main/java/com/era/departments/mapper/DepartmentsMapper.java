package com.era.departments.mapper;

import org.mapstruct.Mapper;

import com.era.departments.dto.DepartmentsDTO;
import com.era.departments.entity.Departments;

@Mapper(componentModel = "spring")
public interface DepartmentsMapper {
	DepartmentsDTO toDto(Departments deptData);
	Departments toEntity(DepartmentsDTO deptDto);
}
