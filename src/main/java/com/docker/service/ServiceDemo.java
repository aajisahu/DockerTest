package com.docker.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.entity.User;
import com.docker.repository.UserRepository;
import com.docker.serviceInterface.ServiceInterface;

@Service
public class ServiceDemo implements ServiceInterface {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<String> getAllNamList() {

		List<String> names = new ArrayList<>();

		names.add("Deepak");
		names.add("Rahul");
		names.add("Ashish");
		names.add("Surjyamani");
		names.add("Pankaj");
		return names;
	}

	@Override
	public User createNewUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	@Override
	public List<String> getAllCreatedUserList() {

		List<String> users = userRepository.findAllFullnames();
//		 List<String> collect = users.stream().map(e -> e.getFullname())
//				 .collect(Collectors.toList());
		return users ;
	}

}
