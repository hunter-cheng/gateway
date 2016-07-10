package com.gateway.dao;

import com.gateway.model.User;

public interface UserDao {
	/**
	 * 创建用户
	 * @param user
	 */
	public void createUser(User user);
	/**
	 * 查询用户
	 * @param user
	 * @return
	 */
    public User  findUser(User user);
    /**
     * 更新用户
     * @param user
     */
    public void updateUser(User user);
    /**
     * 删除用户
     * @param UserId
     */
    public void deleteUser(int UserId);
}