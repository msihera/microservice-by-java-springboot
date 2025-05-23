package com.era.departments.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentsDTO {
    private int deptId;
    private String deptName;
    private String locationId;
    private String locationName;
}
