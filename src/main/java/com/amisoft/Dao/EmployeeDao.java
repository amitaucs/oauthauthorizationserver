package com.amisoft.Dao;

import com.amisoft.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by amitdatta on 04/05/17.
 */

@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Long> {

    Employee findEmployeeByName(String name);
}
