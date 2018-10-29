package com.dcb.dao;

import com.dcb.entity.User;

public interface UserDao {

    User getUserById(String id);

    User getUserByUserName(String username);
}