
package com.exalt.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exalt.server.dao.UserRepository;
import com.exalt.server.model.Device;
import com.exalt.server.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	
	public User findById(int id) {
		return userRepository.findOne(id);
	}
	
	public User findByName(String name) {
		return userRepository.findByName(name);
	}
	
	public List<Device> findDevice() {
		return userRepository.findDevice();
	}

	
	public List<User> findByAdmin() {
		return userRepository.findByAdmin();
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}

	public void deleteUserById(int id) {
		
		userRepository.delete(id);
	}

	public boolean isUserExist(User user) {
		return findByName(user.getName())!=null;
	}


	public void deleteAllUsers() {
		userRepository.deleteAll();
	}

}
