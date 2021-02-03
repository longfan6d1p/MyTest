package com.kuaigou.Test;

import com.kuaigou.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/3 0003 19:34
 */
public class ServiceTest {

    @Test
    public void Test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_service.xml");
        ItemsService bean = context.getBean(ItemsService.class);
        System.out.println(bean.findAll());
    }
}
