package com.dcb.service.impl;

import com.dcb.dao.UserDao;
import com.dcb.entity.User;
import com.dcb.service.UserService;

import lombok.Setter;


public class UserServiceImpl implements UserService {
    @Setter
    private UserDao userDao;
    @Override
    public User getUserByName(String username) {
        return userDao.getUserByUserName(username);
	}
    
}