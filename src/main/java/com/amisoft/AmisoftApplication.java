package com.amisoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableAuthorizationServer
@EnableDiscoveryClient
@RestController
public class AmisoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmisoftApplication.class, args);
	}


	@RequestMapping("/user")
	public Principal user(Principal user){
		return user;
	}

}
