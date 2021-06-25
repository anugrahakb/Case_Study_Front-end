package com.casestudy.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.user.model.User;
import com.casestudy.user.repository.UserRepository;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> getAllProfiles() {
		
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getByUserId(String userId) {
		
		return userRepository.findById(userId);
	}
	@Override
	public User getByFirstName(String firstName) {
		
		return userRepository.findByFirstName(firstName);
	}
	@Override
	public User updateProfile(User userDetails) {
		
		return userRepository.save(userDetails);
	}
	@Override
	public User addNewCustomerProfile(User userDetails) {
		return userRepository.save(userDetails);
	}
	@Override
	public User addAdminProfile(User userDetails) {
		return userRepository.save(userDetails);
	}
	@Override
	public User deleteUserById(String userId) {
		
		return userRepository.deleteByUserId(userId);
	}

}
