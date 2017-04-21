package com.yyz.init;

import com.yyz.config.*;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * Created by yangyeze on 2017/4/20.
 */
public class WebAppInit extends AbstractAnnotationConfigDispatcherServletInitializer
{
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{StudentConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
//        super.customizeRegistration(registration);
        registration.setLoadOnStartup(1);
        registration.setMultipartConfig(new MultipartConfigElement(
                "classpath:/upload/"
        ));

    }
}
