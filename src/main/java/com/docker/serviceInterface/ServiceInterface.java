package com.docker.serviceInterface;

import java.util.List;

import com.docker.entity.User;

public interface ServiceInterface {
	
	public List<String> getAllNamList();
	
	public User createNewUser(User user);

	public List<String> getAllCreatedUserList();
}
