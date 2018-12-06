package com.nascent.openplatformsdktest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/12/6
 * Time:9:44
 */
@ComponentScan(value="com.nascent.openplatformsdktest")
@Configuration
public class MainScanConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(MainScanConfig.class);
        String[] definitionNames = applicationContext2.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
