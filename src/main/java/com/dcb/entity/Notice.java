package com.dcb.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
    private int id;
    private String title;   //消息标题
    private String url;     //消息连接
    private Date date;  //消息时间
    private boolean isRead; //  是否已经被阅读
    private int userId; //用户id

}