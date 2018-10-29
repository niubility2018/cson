package com.dcb.controller;

import com.dcb.entity.User;
import com.dcb.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Setter;

@RestController
@RequestMapping("/")
public class QueryController {
    @Setter
    private UserService userService;
    @GetMapping("login")
    public String login(String username,String password) {
        User user = userService.getUserByName(username);
        if(password != null && password.equals(user.getPassword())) {
            return "login success";
        } else {
            return "login failed";
        }
    }




}