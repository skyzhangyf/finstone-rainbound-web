package com.finstone.rainbound.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyf
 * @description
 * @date 2019/4/19/019
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String helloWord() {
        return "Hello word1!";
    }
}
