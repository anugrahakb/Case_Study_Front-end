package com.casestudy.user.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.user.repository.UserRepository;
import com.casestudy.user.model.User;
@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/demo")
	public String demo() {
		return "User is working";
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/allusers")
	@ResponseStatus(HttpStatus.OK)
	public List<User> getAllProfiles() {
		return userRepository.findAll();
	}
	
	@GetMapping("/allusers/{user_id}")
	@ResponseStatus(HttpStatus.FOUND)
	public Optional<User> getByUserId( @PathVariable String userId) {
		return userRepository.findById(userId);
	}
	
	@GetMapping("/allusers/{firstName}")
	@ResponseStatus(HttpStatus.FOUND)
	public User getByFirstName(@PathVariable String firstName) {
		return userRepository.findByFirstName(firstName);
	}
	
	@PutMapping("/update/{user_id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public User updateProfile(@RequestBody User user, @PathVariable String user_id) {
		user.setUserId(user_id);
		userRepository.save(user);
		return user;
	}
	
	
	@PostMapping("/addUser")
	public String addNewCustomerProfile(@RequestBody User user) {
		userRepository.save(user);
		return "A new Customer is added";
	}
	
	@PostMapping("/addAdmin")
	public String addAdminProfile(@RequestBody User user) {
		userRepository.save(user);
		return "Admin Profile is added";
	}
	
	@DeleteMapping("/delete/{user_id}")
	public String deleteUserById(@PathVariable String userId) {
		userRepository.deleteByUserId(userId);
		return "User Deleted with an Id: " + userId;
	}
}
