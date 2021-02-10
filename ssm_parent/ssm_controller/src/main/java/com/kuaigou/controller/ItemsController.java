package com.kuaigou.controller;

import com.kuaigou.pojo.Items;
import com.kuaigou.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/3 0003 19:49
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/add")
    public String add(Items items) {
        System.out.println("请求到来");
        // 添加到数据库
        int row = itemsService.add(items);
        return "redirect:/items/findAll";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){

        List<Items> list = itemsService.findAll();

        model.addAttribute("items",list);

        return "list";

    }
}
