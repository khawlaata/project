package com.exalt.server.service;

import java.util.List;

import com.exalt.server.model.Device;
import com.exalt.server.model.User;



public interface UserService {
	
	User findById(int id);
	
	User findByName(String name);
	List<User>  findByAdmin ();
	List<Device> findDevice();
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(int id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);
	
}
