package com.md.service;

import java.util.List;

import com.md.beans.TrainException;
import com.md.beans.UserBean;

public interface UserService {

	public UserBean getUserByEmailId(String userEmailId) throws TrainException;

	public List<UserBean> getAllUsers() throws TrainException;

	public String updateUser(UserBean customer);

	public String deleteUser(UserBean customer);

	public String registerUser(UserBean customer);
	
	public UserBean loginUser(String username, String password) throws TrainException;

}
