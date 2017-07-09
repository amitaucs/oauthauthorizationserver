package com.amisoft;

import com.amisoft.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class ServiceConfig  extends GlobalAuthenticationConfigurerAdapter{

    @Autowired
    EmployeeServiceImpl employeeService;

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {

        auth.authenticationProvider(authProvider());



    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    public DaoAuthenticationProvider authProvider(){

        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(employeeService);
       // authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }
}
