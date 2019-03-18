package com.jeaho.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RedirectController {

    @RequestMapping("/before")
    public ModelAndView index(ModelAndView mav) {
	mav.setViewName("index4");
	return mav;
    }
    @RequestMapping("/redirect")
    public String redirect() {
	return "redirect:/";
    }
    @RequestMapping("/forward")
    public String foreward() {
	return "forward:/";
    }
    @RequestMapping("/mavRedirect")
    public ModelAndView mavRedirect() {
	return new ModelAndView("redirect:/");
    }
}
