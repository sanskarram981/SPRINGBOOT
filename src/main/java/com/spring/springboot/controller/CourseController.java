package com.spring.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController 
{
    @RequestMapping(path="/course",method=RequestMethod.GET)
    @ResponseBody
    public String getCourse()
    {
        return "the course name is java";
    }
}
