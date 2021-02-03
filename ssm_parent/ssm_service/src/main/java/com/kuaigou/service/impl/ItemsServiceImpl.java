package com.kuaigou.service.impl;

import com.kuaigou.dao.ItemsDao;
import com.kuaigou.pojo.Items;
import com.kuaigou.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/3 0003 19:26
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Override
    @Transactional  // 开启事务管理
    public int add(Items items) {
        int row = itemsDao.add(items);
        return row;
    }
}
