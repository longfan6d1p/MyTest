package com.kuaigou.dao;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/3 0003 19:15
 */
public class TestDao {

    @Test
    public void Test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_mybatis.xml");
        ItemsDao bean = context.getBean(ItemsDao.class);
        System.out.println(bean.findAll());
    }
}
