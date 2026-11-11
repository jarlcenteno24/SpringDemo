package com.spring.spring_demo.rest;

import com.spring.spring_demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles sample greeting, assignment, and student-scope requests.
 */
@RestController
public class SampleRestController {

    private Student myStudent;
    private Student anotherStudent;

    /**
     * Creates the controller with two references to the qualified student bean.
     *
     * @param theStudent the student used to provide the daily assignment
     * @param theAnotherStudent the student used to compare bean scope
     */
    // Constructor Injection using @Qualifier
    @Autowired
    public SampleRestController(
            @Qualifier("elementaryStudent") Student theStudent,
            @Qualifier("elementaryStudent") Student theAnotherStudent) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myStudent = theStudent;
        anotherStudent = theAnotherStudent;
    }

    // Setter Injection (Alternative option)
    /*
    @Autowired
    public void setStudent(@Qualifier("universityStudent") Student theStudent) {
        myStudent = theStudent;
    }
    */

    /**
     * Returns a greeting.
     *
     * @return the greeting text
     */
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    /**
     * Returns the daily assignment for the configured student.
     *
     * @return the student's daily assignment
     */
    @GetMapping("/assignment")
    public String getDailyAssignment() {
        return myStudent.getDailyAssignment();
    }

    /**
     * Indicates whether both injected student references point to the same bean.
     *
     * @return a message containing whether the references are identical
     */
    @GetMapping("/check")
    public String checkScope() {
        return "myStudent == anotherStudent? " + (myStudent == anotherStudent);
    }
}