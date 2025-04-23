package com.example.databale.demodatatable.repository;


import com.example.databale.demodatatable.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
