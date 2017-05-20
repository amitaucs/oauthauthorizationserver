package com.amisoft.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by amitdatta on 04/05/17.
 */
public class PassCodeUtils {

    public static void main(String[] args){

        String password = "johnpass";

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode(password));
    }
}
