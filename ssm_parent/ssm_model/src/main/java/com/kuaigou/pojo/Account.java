package com.kuaigou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/3 0003 18:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private int id;
    private String name;
    private int money;
}
