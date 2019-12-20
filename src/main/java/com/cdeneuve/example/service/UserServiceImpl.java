package com.cdeneuve.example.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}
