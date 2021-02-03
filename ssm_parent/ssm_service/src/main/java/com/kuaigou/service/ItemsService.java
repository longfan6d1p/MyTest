package com.kuaigou.service;


import com.kuaigou.pojo.Items;

import java.util.List;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/3 0003 19:24
 */
public interface ItemsService {

    List<Items> findAll();

    int add(Items items);
}
