package com.nettytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
//    @RequestMapping("/hello")
//    public String index(){
//        return "redirect:hello.html";
//    }

//    @RequestMapping("/hello")
//    public String index(){
//        return "hello.html";
//    }


    /**
     * 这三种方式都可以跳转HTML,注意后缀是html
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public ModelAndView helloTest() {
        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;
    }

    @RequestMapping("/index")
    @ResponseBody
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping("/thymeleaf")
    @ResponseBody
    public ModelAndView thymeleafTest() {
        ModelAndView modelAndView = new ModelAndView("thymeleaf");
        return modelAndView;
    }

}
