package com.demo.filter_and_interceptor.contoller;

import com.demo.filter_and_interceptor.config.domian.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable("id") String id) {

        System.out.println("id:" + id);

        User user = new User();
        user.setName("bravo");
        user.setAge(18);
        user.setAddress("wenzhou");

        return user;
    }
}
