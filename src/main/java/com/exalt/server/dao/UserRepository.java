package com.exalt.server.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exalt.server.model.Device;
import com.exalt.server.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);
	@Query( nativeQuery = true , value = "SELECT u.* FROM users u , user_roles ur where ur.user_id = u.id and ur.roles_id = 1")
	List<User> findByAdmin();
	
	@Query(nativeQuery = true  , value = "SELECT d.* FROM device d JOIN users u ON u.id = d.user_id where u.id =1")
	List<Device> findDevice();
	
	
}