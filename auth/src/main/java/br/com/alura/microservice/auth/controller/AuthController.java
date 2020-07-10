package br.com.alura.microservice.auth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthController {
	
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}

}
