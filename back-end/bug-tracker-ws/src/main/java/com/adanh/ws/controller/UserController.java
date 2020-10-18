package com.adanh.ws.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adanh.ws.dto.UserDTO;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@PostMapping
	public UserDTO signUp(@RequestBody UserDTO userDTO) {
		System.out.print(userDTO.toString());
		return userDTO;
	}

}
