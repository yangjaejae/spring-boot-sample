package com.jeaho.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DataController {

    @RequestMapping("/data")
    public ModelAndView data(ModelAndView mav) {
	mav.setViewName("data");
	mav.addObject("msg", "current data");
	DataObject obj = new DataObject(123, "lee", "lee@flower");
	mav.addObject("object", obj);
	return mav;
    }
}
