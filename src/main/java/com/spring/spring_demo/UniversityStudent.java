package com.spring.spring_demo;

import org.springframework.stereotype.Component;

/**
 * A student attending a university.
 */
@Component
// @Scope("prototype") // (Optional bean scope setting)
public class UniversityStudent implements Student {

    /** Creates a university student. */
    public UniversityStudent() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    /** {@inheritDoc} */
    @Override
    public String getDailyAssignment() {
        return "Study Spring Boot Coding";
    }
}