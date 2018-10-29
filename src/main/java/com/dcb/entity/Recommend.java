package com.dcb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recommend {
    private int id; //评论内容的id
    private String content; //评论的内容
    private int articleId;  //评论的文章的id
}