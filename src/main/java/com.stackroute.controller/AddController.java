package com.stackroute.controller;

import com.stackroute.configuration.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
    @RequestMapping("/message")
    public ModelAndView message(@RequestParam("User") String userName)
    {
        User user=new User(userName);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",user.getName());
        return mv;
    }
}
