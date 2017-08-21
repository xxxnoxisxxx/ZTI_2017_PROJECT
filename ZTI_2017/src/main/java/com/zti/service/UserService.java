package com.zti.service;

import java.util.List;

import com.zti.model.User;

public interface UserService {
	public void save(User user);
	public User findByUsername(String username);
	public User findByEmail(String email);
	public List<User> findAll();
	public List<String> getAllLoggedUsers();
	public boolean isAuthenticated();
}
