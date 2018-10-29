package com.dcb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Download {
    private int id;
    private int sourceId; //资源id
    private int times;  //下载次数
}