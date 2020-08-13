package com.mm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 后台管理
 *
 * @author lwl
 */
@SpringBootApplication
public class AdminApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AdminApp.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AdminApp.class);
    }
}