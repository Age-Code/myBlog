package com.example.myblog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.example.myblog.mapper")
public class MybatisConfig {
}