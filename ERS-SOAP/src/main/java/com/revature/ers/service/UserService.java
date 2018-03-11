package com.revature.ers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ers.bean.ERSUser;
import com.revature.ers.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;

	public ERSUser addUser(ERSUser user) {
		return userRepo.save(user);
	}

}
