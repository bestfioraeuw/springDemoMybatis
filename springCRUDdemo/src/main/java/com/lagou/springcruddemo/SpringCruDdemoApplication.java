package com.lagou.springcruddemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lagou.mapper")
public class SpringCruDdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCruDdemoApplication.class, args);
    }

}
