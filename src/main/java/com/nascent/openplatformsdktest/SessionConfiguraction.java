//package com.nascent.openplatformsdktest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.*;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//
//
///**
// * Created with IDEA
// * author:ToryXu
// * Date:2018/12/4
// * Time:13:57
// */
//@Configuration
//public class SessionConfiguraction implements  WebMvcConfigurer   {
//
//
//    @Value("${excludePathPatterns}")
//    String excludePath ;
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        String[] excludePathPatterns = excludePath.split(",");
//        System.out.println("hello"+excludePathPatterns[1]);
//        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**").excludePathPatterns(excludePathPatterns);
//        registry.addInterceptor(new SessionInterceptor2()).addPathPatterns("/**").excludePathPatterns(excludePathPatterns);
//    }
//
//}
