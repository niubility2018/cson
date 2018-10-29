package com.dcb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String username;   //用户名
    private String password;   //用户密码
    private String email;      //邮箱
    private String phoneNum;    //电话
}