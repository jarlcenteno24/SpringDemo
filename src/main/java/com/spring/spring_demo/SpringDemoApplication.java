package com.spring.spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Spring Demo application.
 */
@SpringBootApplication
public class SpringDemoApplication {

    /**
     * Starts the Spring Demo application.
     *
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}