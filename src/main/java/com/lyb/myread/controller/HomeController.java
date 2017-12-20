package com.lyb.myread.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yinbin.lan
 * @date 17/12/19
 * @desc 主页
 */
@Controller
public class HomeController {

    @RequestMapping(value = "index")
    @ResponseBody
    public String index(){
       return "What is fuck";
    }
}
