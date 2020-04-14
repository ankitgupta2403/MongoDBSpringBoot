package com.microservices.mongoDBSpringBoot.controller;

import com.microservices.mongoDBSpringBoot.document.Users;
import com.microservices.mongoDBSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<Users>  getUsers()
    {
        return userRepository.findAll();
    }
}
