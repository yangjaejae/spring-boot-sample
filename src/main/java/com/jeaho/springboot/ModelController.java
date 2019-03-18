package com.jeaho.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {
    
    @RequestMapping("/page/{num}")
    public String index(@PathVariable int num, Model model) {
	int res = 0;
	for(int i=0; i<num; i++) {
	    res += i;
	}
	model.addAttribute("msg", res);
	return "model";
    }
}
