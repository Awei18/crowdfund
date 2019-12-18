package com.zhw.crowdfund.manager.controller;


import com.zhw.crowdfund.manager.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/test")
    public String test(){
        System.out.println("test success!");
        System.out.println(categoryService.getCategory(1));
        return "test_success";
    }
}
