package com.dcb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Follow {
    private int id; 
    private int followedId;   //被关注的用户的id
    private int userId;     //用户的id
}