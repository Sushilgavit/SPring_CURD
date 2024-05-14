package com.example.curdApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curdApplication.Repository.userRepository;
import com.example.curdApplication.entities.user;

@Service
public class userSreviceImpl implements userService {

	@Autowired
	private userRepository usrRepo;

	@Override
	public List<user> getAllUsers() {

		return usrRepo.findAll();
	}

	@Override
	public user addUser(user user) {
		// TODO Auto-generated method stub
		return usrRepo.save(user);
	}

	@Override
	public user getUserById(Integer id) {
		// TODO Auto-generated method stub
		return usrRepo.findById(id).orElse(null);
	}

	@Override
	public user updateUser(Integer id, user user) {
		// TODO Auto-generated method stub
		if (usrRepo.existsById(id)) {
			user.setId(id);
			return usrRepo.save(user);
		} else {
			return null;
		}

	}

	@Override
	public user deleteUser(Integer id) {
		// TODO Auto-generated method stub
		user usr = getUserById(id);
		if (usr != null) {
			usrRepo.deleteById(id);
		}
		return null;
	}

}
