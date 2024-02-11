package com.blog.reqositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entitys.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
