package com.example.Dao;


import com.example.model.User;


public interface UserDao {

	boolean addUser(User user);
	boolean isValidUser(String username, String password);
}

