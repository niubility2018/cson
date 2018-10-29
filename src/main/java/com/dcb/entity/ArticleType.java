package com.dcb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleType {
   private int id;  //博客文章类型id
   private String type; //博客文章类型
}