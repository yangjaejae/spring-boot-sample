package com.jeaho.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UseVarController {

    @RequestMapping("var/{id}")
    public ModelAndView var(@PathVariable int id, ModelAndView mav) {
	mav.setViewName("var");
	mav.addObject("id", id);
	mav.addObject("check", id % 2 == 0);
	mav.addObject("trueVal", "Even number!");
	mav.addObject("falseVal", "Odd number...");
	return mav;
    }

    @RequestMapping("/var2/{id}")
    public ModelAndView var2(@PathVariable int id, ModelAndView mav) {
	mav.setViewName("var2");
	mav.addObject("id", id);
	mav.addObject("check", id >= 0);
	mav.addObject("trueVal", "POSITIVE!!");
	mav.addObject("falseVal", "NEGATIVE!!");
	return mav;
    }

    @RequestMapping("/var3/{month}")
    public ModelAndView var3(@PathVariable int month, ModelAndView mav) {
	mav.setViewName("var3");
	int m = Math.abs(month) % 12;
	m = m == 0 ? 12 : m;
	mav.addObject("month", m);
	mav.addObject("check", Math.floor(m / 3));
	return mav;
    }

    @RequestMapping("/var4")
    public ModelAndView var4(ModelAndView mav) {
	mav.setViewName("var4");
	ArrayList<String[]> data = new ArrayList<String[]>();
	data.add(new String[] { "park", "park@naver", "000-000-000" });
	data.add(new String[] { "kim", "kim@naver", "000-000-000" });
	data.add(new String[] { "lee", "lee@naver", "000-000-000" });
	mav.addObject("data", data);
	return mav;
    }
    
    @RequestMapping("/var5/{num}")
    public ModelAndView var5(@PathVariable int num, ModelAndView mav) {
	mav.setViewName("var5");
	mav.addObject("num", num);
	if(num >= 0) {
	    mav.addObject("check", "num >= data.size() ? 0 : num");
	}else {
	    mav.addObject("check", "num <= data.size() * -1 ? 0 : num * -1");
	}
	ArrayList<DataObject> data = new ArrayList<DataObject>();
	data.add(new DataObject(0, "park@naver", "000-000-000"));
	data.add(new DataObject(1, "kim@naver", "000-000-000" ));
	data.add(new DataObject(2, "lee@naver", "000-000-000" ));
	mav.addObject("data", data);
	return mav;
    }
}
