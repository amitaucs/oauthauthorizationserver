package com.amisoft.Dao;

import com.amisoft.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;



@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Long> {

    Employee findEmployeeByName(String name);
}
