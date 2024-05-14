package com.example.curdApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curdApplication.Service.userService;
import com.example.curdApplication.entities.user;

@RestController  

public class userController {
	@Autowired
	private userService usrServ;

	public userController(userService usrServ) {
		super();
		this.usrServ = usrServ;
	}

	@GetMapping("/user")
	public List<user> getAllUsers() {
		return this.usrServ.getAllUsers();
	}

	@PostMapping("/user")
	public user addUser(@RequestBody user user) {
		return usrServ.addUser(user);
	}

	@GetMapping("/user/{id}")
	public user getUserById(@PathVariable Integer id) {
		return usrServ.getUserById(id);

	}

	@PutMapping("/user/{id}")
	public user updateUser(@PathVariable Integer id, @RequestBody user user) {
		return usrServ.updateUser(id, user);

	}

	@DeleteMapping("/user/{id}")
	public user deleteUser(@PathVariable Integer id) {
		return usrServ.deleteUser(id);

	}
}
