package com.kuaigou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/3 0003 18:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {

    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;
}
