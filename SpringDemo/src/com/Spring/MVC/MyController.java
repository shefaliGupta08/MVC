package com.Spring.MVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Spring.Service.AddService;

@Controller
	public class MyController {
	    @RequestMapping("/add")
	    
	    public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
	    {
	    	int i = Integer.parseInt(request.getParameter("t1")); //taking inputs from user
	    	int j = Integer.parseInt(request.getParameter("t2"));
	    //	int k = i+j;
	    	
	    	AddService as = new AddService(); //ctrl+shift+o for package import ... For adding functionality
	    	int k = as.add(i, j);
	    	
	    	ModelAndView mv = new ModelAndView(); // To send the data to display.jsp
	    	
	    	//mv.setViewName("display.jsp"); // When you don'tmention extensions, extn may be change either jsp or anything.
	    	mv.setViewName("display");
	    	mv.addObject("result",k); // result is label here, which is going to use in display.jsp
	    	
	   // System.out.println("I am here"); 
	    	return mv;
	    }
}
	


