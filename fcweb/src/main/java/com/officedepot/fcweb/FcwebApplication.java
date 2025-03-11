package com.officedepot.fcweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.officedepot.core.config", "com.officedepot.fcweb"})
public class FcwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FcwebApplication.class, args);
    }

}
