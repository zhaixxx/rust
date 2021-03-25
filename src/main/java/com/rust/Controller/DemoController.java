package com.rust.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RestController
public class DemoController {
    @GetMapping("/hand1")
    public ModelAndView hand1(){
        Date date=new Date();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("date",date);
        modelAndView.setViewName("/success");
        System.out.println(date);
        return modelAndView;
    }

}
