package com.hk.springapp;

import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= "com.hk.springapp")
public class WebConfig  {


	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver(){
	InternalResourceViewResolver  resolver = new InternalResourceViewResolver ();
	resolver.setPrefix("/WEB-INF/jsp/");
	resolver.setSuffix(".jsp");	
	return resolver;
	}
	
}
