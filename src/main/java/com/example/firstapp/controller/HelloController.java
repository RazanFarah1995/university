package com.example.firstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(path = "/main", method = RequestMethod.GET)
    @ResponseBody
    public String main () {
        return "hello";
    }
}
