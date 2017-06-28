package com.josephaws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 101005833 on 2017/6/28.
 */
@Controller
public class HelloController {
    @RequestMapping("hello")
    public String hello() {
        return "index";
    }
}
