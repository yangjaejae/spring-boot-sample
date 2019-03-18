package com.jeaho.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InlineController {

    @RequestMapping("/inline")
    public ModelAndView inline(ModelAndView mav) {
	mav.setViewName("inline");
	ArrayList<DataObject> data = new ArrayList<DataObject>();
	data.add(new DataObject(0, "park", "park@baver"));
	data.add(new DataObject(1, "kim", "kim@baver"));
	data.add(new DataObject(2, "lee", "lee@baver"));
	mav.addObject("data", data);
	return mav;
    }
    
    @RequestMapping("/inlineScript/{tax}")
    public ModelAndView inlineScript(@PathVariable int tax, ModelAndView mav) {
	mav.setViewName("inlineScript");
	mav.addObject("tax", tax);
	return mav;
    }
}
