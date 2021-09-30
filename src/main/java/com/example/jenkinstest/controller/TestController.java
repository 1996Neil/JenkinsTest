package com.example.jenkinstest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cathy_yang
 * @version 1.0
 * @ClassName TestController
 * @create 2021-09-30 5:55 下午
 * @description
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String output(){
        return  "hello world";
    }
}
