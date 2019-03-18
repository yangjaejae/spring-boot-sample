package com.jeaho.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IncludeController {
    
    @RequestMapping("/include")
    public ModelAndView include(ModelAndView mav) {
	mav.setViewName("include");
	return mav;
    }
}
