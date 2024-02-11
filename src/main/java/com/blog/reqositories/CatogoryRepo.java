package com.blog.reqositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entitys.Category;

public interface CatogoryRepo extends JpaRepository<Category, Integer> {

}
