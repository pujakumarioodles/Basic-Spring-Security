package com.example.demo;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@SpringBootApplication
public class DemoApplication {
	
	
	
	@Autowired
	private Environment env;
	private Logger logger=Logger.getLogger(getClass().getName());
	/*	@Bean
		public ViewResolver viewResolver() 
		{
			InternalResourceViewResolver view=new InternalResourceViewResolver();
			view.setPrefix("/WEB-INF/view/");
			view.setSuffix(".jsp");
			
			return view;
		}
		*/
	

	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
