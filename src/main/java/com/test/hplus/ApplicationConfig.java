package com.test.hplus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan({"com.test.controllers", "com.test.repository","com.test.bean"})
public class ApplicationConfig extends WebMvcConfigurationSupport

{

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
          .addResourceHandler("css/**","images/**")
          .addResourceLocations("/static/css/","/static/images/");	
    }
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
		 registry.addViewController("/").setViewName("forward:/index.jsp");
    }
	
	@Bean
	  public InternalResourceViewResolver viewResolver() {
	    InternalResourceViewResolver irv = new InternalResourceViewResolver();
	    irv.setPrefix("/WEB-INF/jsp/");
	    irv.setSuffix(".jsp");
        irv.setViewClass(JstlView.class);
	    return irv;

	  }
	
}
