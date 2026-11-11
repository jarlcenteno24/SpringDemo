package com.spring.spring_demo;

/**
 * Represents a student who can provide a daily assignment.
 */
public interface Student {

    /**
     * Gets the assignment the student should complete today.
     *
     * @return the daily assignment
     */
    String getDailyAssignment();
}