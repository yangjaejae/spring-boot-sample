package com.jeaho.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormTestController {

    @RequestMapping(value="/form", method=RequestMethod.GET)
    public ModelAndView index(ModelAndView mav) {
	
	mav.addObject("msg", "이름을 적어주세요");
	mav.setViewName("form");
	return mav;
    }
    
    @RequestMapping(value="/form", method=RequestMethod.POST)
    public ModelAndView index(@RequestParam String str, ModelAndView mav) {
	
	mav.addObject("value", "안녕하세요" + str + "님");
	mav.setViewName("form");
	return mav;
    }
}
