package com.empapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empapp.entities.Employee;

@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer>{

}