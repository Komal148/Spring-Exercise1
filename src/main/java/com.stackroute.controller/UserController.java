package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    User user =new User();

    @RequestMapping(value = "/")
    public String greeting(ModelMap map)
    {
        map.addAttribute("greeting","Welcome to the Stackroute!!"+user.getName());
        return "index";
    }
}
