package com.gateway.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gateway.dao.UserDao;
import com.gateway.model.User;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
    private UserDao userDao;
	public User login(String name, String password) {
		User u=new User();
		u.setName(name);
		u.setPassword(password);
		return userDao.findUser(u);
	}

	public boolean logout(String name) {
		return true;
	}

	@Override
	public boolean reg(String name, String password) {
		User u=new User();
		u.setName(name);
		u.setPassword(password);
		u=userDao.createUser(u);
		if(u!=null){
			return true;
		}
		return false;
	}
     
}
