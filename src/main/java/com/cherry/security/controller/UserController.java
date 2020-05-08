package com.cherry.security.controller;

import com.cherry.security.mapper.UserMapper;
import com.cherry.security.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SecurityController
 *
 * @author Hang W
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("{id}")
    public String getUserById(@PathVariable Long id) {
        People people = userMapper.queryUserById(id);
        return people.getName();
    }

}
