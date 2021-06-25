package com.casestudy.user.service;

import java.util.List;
import java.util.Optional;

import com.casestudy.user.model.User;

public interface UserService {
	
	Optional<User> getByUserId(String userId);

	List<User> getAllProfiles();
	
	User addNewCustomerProfile(User userDetails);
	
	User addAdminProfile(User userDetails);

	User getByFirstName(String firstName);

	User updateProfile(User userDetails);

	User deleteUserById(String userId);

}
