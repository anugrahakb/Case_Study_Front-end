package com.casestudy.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.user.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{
	
	User findByMobileNo(Long mobileNo);

	User findByFirstName(String firstName);

	User deleteByUserId(String userId);

}
