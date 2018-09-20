package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("可以访问: http://localhost:8080/home");
        System.out.println("可以访问视图页面: http://localhost:8080/freemarker");
        System.out.println("可以访问数据库数据: http://localhost:8080/db");
        System.out.println("可以访问druid控制台: http://localhost:8080/druid   用户名密码都是druid 配置文件有");
        System.out.println("可以访问数据库控制台: http://localhost:8080/h2-console  用户名:sa 密码:admin 配置文件有");
    }
}
