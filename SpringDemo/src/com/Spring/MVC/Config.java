package com.Spring.MVC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration                           // Represents configuration class
@ComponentScan({"com.Spring.MVC"})                           //Scan package
public class Config {    // In place of servlet file

// Create Internal view resolover responsible to render view name .. like jsp or anything.
	
	@Bean // Specify that it will give object of InternalView Resolver
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		
		// need to specify location of file + extension
		
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		return vr;
		
		
	}

}
