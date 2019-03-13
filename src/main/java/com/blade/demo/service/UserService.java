package com.blade.demo.service;

import com.blade.demo.domain.entity.User;
import com.blade.ioc.annotation.Bean;

import static io.github.biezhi.anima.Anima.deleteById;
import static io.github.biezhi.anima.Anima.select;

import java.util.List;

@Bean
public class UserService {

    public String sayHello() {
        return "Hello";
    }
    
    public List<User> getUsers() {
        return select().from(User.class).all();
    }

    public Integer saveUser(User user) {
        System.out.println("save user: " + user);
        return user.getId();
    }
}