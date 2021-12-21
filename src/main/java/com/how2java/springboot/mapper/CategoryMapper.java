package com.how2java.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.how2java.springboot.pojo.Category;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CategoryMapper {

    List<Category> findAll();
    public int addCategory(Category category);

    public void deleteCategory(int id);

    public Category get(int id);

    public int updateCategory(Category category);

}