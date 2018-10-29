package com.dcb.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Upload {
    private int id;
    private String name;    //资源名称
    private String type;    //资源类型
    private String classification;  //资源分类
    private String tags;    //资源标签
    private String description; //资源描述
    private String url; //资源所在路径
    private Date date;  //上传资源时间
    private int scores; //资源定价积分
    private int userId; //用户id

}