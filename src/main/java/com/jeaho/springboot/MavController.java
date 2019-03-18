package com.jeaho.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MavController {

    @RequestMapping("/mav/{num}")
    public ModelAndView index(@PathVariable int num, ModelAndView mav) {
	int res = 0;
	for(int i=0; i<num; i++) {
	    res += i;
	}
	mav.addObject("msg", res);
	mav.setViewName("mav");
	return mav;
    }
}
