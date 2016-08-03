package com.gateway.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gateway.dao.UserDao;
import com.gateway.model.User;
@Service
public class UserServiceImpl implements IUserService{
	@Resource
    private UserDao userDao;
	public User login(String name, String password) {
		User u=new User();
		u.setName(name);
		u.setPassword(password);
		return userDao.createUser(u);
	}

	public boolean logout(String name, String password) {
		User u=new User();
		u.setName(name);
		u.setPassword(password);
		u=userDao.findUser(u);
		if(u!=null){
			return true;
		}
		return false;
	}
     
}
