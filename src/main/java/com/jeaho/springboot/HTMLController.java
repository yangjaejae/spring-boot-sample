package com.jeaho.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HTMLController {
    
    @RequestMapping("html")
    public ModelAndView html(ModelAndView mav) {
	mav.setViewName("html");
	mav.addObject("msg", "message 1<hr/>message 2<br/>message 3");
	return mav;
    }
}
