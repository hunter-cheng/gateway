package com.gateway.service;

import com.gateway.model.User;

public interface IUserService {
	
    /**
     * 用户注册
     * @param id
     * @return
     */
    public boolean reg(String name,String password); 
	 /**
	  * 用户登陆
	  * @param name
	  * @param password
	  * @return
	  */
     public User login(String name,String password);
     /**
      * 用户登出
      * @param id
      * @return
      */
     public boolean logout(String name); 
}
