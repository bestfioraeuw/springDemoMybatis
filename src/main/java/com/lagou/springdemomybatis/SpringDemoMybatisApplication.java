package com.lagou.springdemomybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.lagou.mapper")
public class SpringDemoMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoMybatisApplication.class, args);
    }

}
