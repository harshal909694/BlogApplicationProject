package com.BikkadIT.Services;

import java.util.List;

import com.BikkadIT.Payloads.UserDto;

public interface UserService {
	
	UserDto createUser (UserDto user);
	
	UserDto UpdateUser(UserDto user , Integer userId);
	
	UserDto getUserById(Integer UserId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);
	
	

}
