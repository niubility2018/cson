package com.dcb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Favorite {
    private int id;
    private int articleId;  //被收藏的文章的id
    private int userId; //用户id
}