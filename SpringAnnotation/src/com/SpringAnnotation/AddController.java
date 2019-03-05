package com.SpringAnnotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("add")
	//t1 value will be assigned to num1
	public ModelAndView add(@RequestParam("t1") int num1,@RequestParam("t2") int num2) // t1 & t2 is name of field in html
	{
		int k = num1 + num2;
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("result.jsp");
		mv.addObject("result",k);
		
		
		return mv;
		
		
	}
	
	

}
