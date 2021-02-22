package com.hospitalRegistrationSystem.user;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User patient;

    @BeforeEach
    void setUp() {
        patient = new User();
    }

    @AfterEach
    void tearDown() {
        patient = null;
    }

    @Test
    void testUserFirstNameCanBeSet(){
        patient.setFirstName("Jane");
        assertEquals("Jane", patient.getFirstName());
    }

    @Test
    void testUserMiddleNameCanBeSet(){
        patient.setMiddleName("");
        assertEquals("", patient.getMiddleName());
    }

    @Test
    void testUserLastNameCanBeSet(){
        patient.setLastName("Doe");
        assertEquals("Doe", patient.getLastName());
    }

    @Test
    void testToGetUserFullName(){
        patient.setFirstName("Jane");
        patient.setMiddleName("Karaken");
        patient.setLastName("Doe");
        assertEquals("Jane Karaken Doe", patient.getFullName());
    }
}