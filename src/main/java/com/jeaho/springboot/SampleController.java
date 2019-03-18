package com.jeaho.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @RequestMapping(value="/sample", method=RequestMethod.GET)
    public ModelAndView index(ModelAndView mav) {
	
	mav.setViewName("sample");
	return mav;
    }
    
}
