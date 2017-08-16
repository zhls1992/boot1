package com.thor.ode.boot1.controller;

import com.thor.ode.boot1.dao.UserRepository;
import com.thor.ode.boot1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
public class TestController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/test")
    public String test(){
        return "so easy!";
    }

    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public User getUser() {

        User user=userRepository.findByUserName("aa");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
