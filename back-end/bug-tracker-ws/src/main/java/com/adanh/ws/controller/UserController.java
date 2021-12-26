package com.adanh.ws.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adanh.ws.dto.UserDTO;
import com.adanh.ws.dto.UserResponse;
import com.adanh.ws.services.UserService;

@RestController

public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/users")
	@PostMapping
	public UserResponse addUsers(@RequestBody UserDTO userRequest) {
		
		UserDTO userDto = new UserDTO();
		
		BeanUtils.copyProperties(userRequest, userDto);
		
		UserDTO createdUser = userService.addUsers(userDto);
		
		UserResponse userResponse = new UserResponse();
		
		BeanUtils.copyProperties(createdUser, userResponse);
		
		return userResponse;
	}

	@GetMapping("/welcome")
	public String index() {
	    return "Welcome jenkins auto deploy V2";
	}
}
