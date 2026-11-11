package com.spring.spring_demo;

import org.springframework.stereotype.Component;

/**
 * A student in senior high school.
 */
@Component
public class SeniorHighStudent implements Student {

    /** Creates a senior high school student. */
    public SeniorHighStudent() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    /** {@inheritDoc} */
    @Override
    public String getDailyAssignment() {
        return "Complete chemistry lab report";
    }
}