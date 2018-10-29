package com.dcb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelfArticleClass {
    private int id; //个人分类类型id
    private String classification;    //个人文章类型
}