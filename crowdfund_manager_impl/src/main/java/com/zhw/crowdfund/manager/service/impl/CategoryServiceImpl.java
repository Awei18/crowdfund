package com.zhw.crowdfund.manager.service.impl;

import com.zhw.crowdfund.bean.Category;
import com.zhw.crowdfund.manager.dao.CategoryDao;
import com.zhw.crowdfund.manager.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    public Category getCategory(int id){
        return categoryDao.getCategory(id);
    }
}
