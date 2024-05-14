package com.example.curdApplication.Service;

import java.util.List;

import com.example.curdApplication.entities.user;

public interface userService {

	public List<user> getAllUsers();

	public user addUser(user user);

	public user getUserById(Integer id);

	public user updateUser(Integer id, user user);

	public user deleteUser(Integer id);
	

}
