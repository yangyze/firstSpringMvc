package com.yyz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by yangyeze on 2017/4/20.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.yyz.controller")
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver getViewResolver()
    {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setExposeContextBeansAsAttributes(true);
        return internalResourceViewResolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        super.configureDefaultServletHandling(configurer);
        configurer.enable();
    }

}
