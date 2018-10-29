package com.dcb.service;

import com.dcb.entity.User;

public interface UserService {
    User getUserByName(String username);
}