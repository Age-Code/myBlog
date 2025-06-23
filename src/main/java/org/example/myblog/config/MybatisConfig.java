package org.example.myblog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "org.example.myblog.mapper")
public class MybatisConfig {
}