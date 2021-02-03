package com.kuaigou.dao;

import com.kuaigou.pojo.Items;

import java.util.List;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/3 0003 19:05
 */
public interface ItemsDao {

    int add(Items items);

    List<Items> findAll();
}
