package com.blog.reqositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entitys.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer>{

    Optional<User> findByEmail(String email);
}
