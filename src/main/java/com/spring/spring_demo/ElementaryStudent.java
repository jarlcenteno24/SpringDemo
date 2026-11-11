package com.spring.spring_demo;

/**
 * A student in elementary school.
 */
public class ElementaryStudent implements Student {

    /** Creates an elementary school student. */
    public ElementaryStudent() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    /** {@inheritDoc} */
    @Override
    public String getDailyAssignment() {
        return "Have to complete 日本語しゅくだい";
    }
}