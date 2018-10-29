package com.dcb.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    private int id;
    private Date loginDate; //登录日期
    private int userId; //用户id
}