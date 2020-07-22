package com.qianshe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动类
 * 配置类
 * 自动加载配置文件
 * @EnableAutoConfiguration
 * */
@SpringBootApplication
/*
扫描mapper包
*/
@MapperScan("com.qianshe.mapper")
public class StarterDemo {
    public static void main(String[] args) {
        SpringApplication.run(StarterDemo.class, args);
    }
}
