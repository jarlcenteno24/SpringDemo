package com.spring.spring_demo;

import com.spring.spring_demo.ElementaryStudent;
import com.spring.spring_demo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Defines Spring beans for the school application.
 */
@Configuration
public class SchoolConfig {

    /**
     * Creates the elementary student bean.
     *
     * @return the elementary student
     */
    @Bean
    public Student elementaryStudent() {
        return new ElementaryStudent();
    }
}