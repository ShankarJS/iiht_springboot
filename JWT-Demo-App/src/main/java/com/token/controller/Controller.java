package com.token.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.token.entity.JwtRequest;
import com.token.entity.JwtResponse;
import com.token.service.UserService;
import com.token.utility.JWTUtility;

@RestController
public class Controller {
	
	@Autowired
	private JWTUtility jwtUtility;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "Hello you have unloacked home so you can see this data";
	}
	
	@PostMapping("/auth")
	public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
		} catch(BadCredentialsException e) {
			throw new Exception("Invalid credentials");
		}
		
		final UserDetails userDetails = userService.loadUserByUsername(jwtRequest.getUsername());
		final String token = jwtUtility.generateToken(userDetails);
		return new JwtResponse(token);
		
	}
	
	
}
