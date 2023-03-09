package com.Humancloud.HealthCare.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.Humancloud.HealthCare.entity.User;
import com.Humancloud.HealthCare.repository.UserRepository;

@Service
public class UserService {
@Autowired	
private UserRepository repository;

public User registerUser(User user) {
	if(user.getPassword().equals(user.getConfirmPassword())) {
		return repository.save(user);
	}
		
		
	return null;
}
	

}