package com.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.docker.entity.User;
import com.docker.serviceInterface.ServiceInterface;

@RestController
@RequestMapping("/dockerDemo")
//localhost:8080/dockerDemo
public class Controller {

	@Autowired
	private ServiceInterface serviceInterface;

	@GetMapping("/getAllNames")
	public List<String> getAllNames() {
		return serviceInterface.getAllNamList();
	}

	@PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
	    return serviceInterface.createNewUser(user);
	}
	@GetMapping("/getCreatedUserFullNames")
	public List<String> getCreatedUserFullNames() {
		return serviceInterface.getAllCreatedUserList();
	}
}
