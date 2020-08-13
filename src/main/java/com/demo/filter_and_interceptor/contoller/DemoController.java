package com.demo.filter_and_interceptor.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 曾睿
 * @Date: 2020/3/13 10:32
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/1")
    public String demo(){
        return "hhh112";
    }

}
