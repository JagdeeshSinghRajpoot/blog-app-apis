package com.blog.reqositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entitys.Category;
import com.blog.entitys.Post;
import com.blog.entitys.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	
	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);

	List<Post> findByTitleContaining(String title);
	
}
