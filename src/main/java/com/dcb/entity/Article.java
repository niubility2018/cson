package com.dcb.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private int id; //文章id
    private String tile;    //文章标题
    private int readers;    //文章阅读量
    private String content; //文章内容
    private boolean isSecret;   //是否保密
    private Date date;      //文章发布时间
    private String tags;    //文章标签
    private String type;    //文章类型
    private String brief;   //文章简介
    
}