package com.llewyn.jpa.contorller;

import com.llewyn.jpa.entity.User;
import com.llewyn.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Usercontroller {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user= (User) userRepository.findAll();
        return user;
    }
}
