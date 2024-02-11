package com.blog.security;

import com.blog.entitys.User;
import com.blog.exceptions.ResourceNotFoundException;
import com.blog.exceptions.ResourceNotFoundExceptionForString;
import com.blog.reqositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    private User user;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //loading user form database by username
        user = this.userRepo.findByEmail(username).orElseThrow(() -> new ResourceNotFoundExceptionForString("User " , "email ", username));
        return user;
    }

}
