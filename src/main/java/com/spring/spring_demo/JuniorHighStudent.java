package com.spring.spring_demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * A lazily initialized student in junior high school.
 */
@Component
@Lazy
public class JuniorHighStudent implements Student {

    /** Creates a junior high school student. */
    public JuniorHighStudent() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    /** {@inheritDoc} */
    @Override
    public String getDailyAssignment() {
        return "Study Spring Boot coding";
    }
}