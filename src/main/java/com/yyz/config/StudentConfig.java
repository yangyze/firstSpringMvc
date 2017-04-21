package com.yyz.config;

import com.yyz.service.StudentService;
import org.springframework.context.annotation.*;

/**
 * spring 配置类  通过设置 ComponentScan 能够自动装配，
 * Created by yangyeze on 2017/4/20.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.yyz")

public class StudentConfig {
    /**
     * 显示声明一个bean
     * @return
     */
//    @Bean
//    @Profile("dev")
//    public StudentService getStudenService(){
//        System.out.println("i am xianshi bean");
//
//        return  new StudentService("xxxxxxxxxxx");
//    }
//    @Bean
//    @Profile("pro")
//    public StudentService getStudenService2(){
//        System.out.println("i am xianshi bean2");
//
//        return  new StudentService();
//    }
}
