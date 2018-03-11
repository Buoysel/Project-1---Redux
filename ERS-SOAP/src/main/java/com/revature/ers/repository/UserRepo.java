package com.revature.ers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.ers.bean.ERSUser;

public interface UserRepo extends JpaRepository<ERSUser, Integer>{

}
