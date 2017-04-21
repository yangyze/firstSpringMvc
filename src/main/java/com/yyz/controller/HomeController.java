package com.yyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangyeze on 2017/4/20.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
