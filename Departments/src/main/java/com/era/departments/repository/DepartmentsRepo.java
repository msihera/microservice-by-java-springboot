package com.era.departments.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.era.departments.entity.Departments;

@Repository
public interface DepartmentsRepo extends JpaRepository<Departments, Integer>{
List<Departments> findAll();
}
