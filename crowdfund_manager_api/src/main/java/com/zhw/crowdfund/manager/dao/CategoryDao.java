package com.zhw.crowdfund.manager.dao;

import com.zhw.crowdfund.bean.Category;
import org.springframework.stereotype.Repository;



public interface CategoryDao {
    Category getCategory(Integer id);
}
