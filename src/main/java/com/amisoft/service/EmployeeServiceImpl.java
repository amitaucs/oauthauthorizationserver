package com.amisoft.service;

import com.amisoft.Dao.EmployeeDao;
import com.amisoft.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;



@Service("employeeService")
public class EmployeeServiceImpl implements UserDetailsService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

        Employee employee = employeeDao.findEmployeeByName(name);


        Set<GrantedAuthority> grantedAuthority = new HashSet<>();
        grantedAuthority.add(new SimpleGrantedAuthority(employee.getRole()));

        return new User(employee.getName(), employee.getPassword(), true, true, true, true, grantedAuthority);


    }
}
