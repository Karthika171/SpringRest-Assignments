package com.example.two.SpringRestLogin.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.two.SpringRestLogin.entity.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> users;

	public UserServiceImpl() {
		users = new ArrayList<>();
		users.add(new User("Peter", "3546"));
		users.add(new User("Sakthi", "6574"));
		users.add(new User("Bose", "3356"));
		users.add(new User("Jeyanth", "2304"));
		users.add(new User("Harish", "7688"));
		users.add(new User("Mathi", "4675"));
		users.add(new User("Shinchan", "6764"));
		users.add(new User("Gokul", "3546"));
	}

	@Override
	public String check(User u1) {
		for (User u : users)
			{
		  if(u.getUserName().matches(u1.getUserName()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

}
