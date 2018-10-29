package com.dcb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rank {
    private int id;
    private int rank;   //博客排名
    private long hits;  //博客的总访问量
    private int scores; //博客的积分

}