package com.BikkadIT.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.Entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
