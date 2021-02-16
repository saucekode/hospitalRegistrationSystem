package com.hospitalRegistrationSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        user = new User();
        User.userId = 0;
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        user = null;
    }

    @Test
    void testThatAUserIdIsCreatedOnCreationOfNewUser(){
        User newUser = new User();
        int userId = newUser.getUserId();
        assertEquals(1, userId);

        User newUser2 = new User();
        int userId2 = newUser2.getUserId();
        assertEquals(2, userId2);
    }

    @Test
    void testThatAUserFirstNameCanBeSet(){
        user.setFirstName("Amaka");
        assertEquals("Amaka", user.getFirstName());
    }

    @Test
    void testThatAUserLastNameCanBeSet(){
        user.setLastName("Mbah");
        assertEquals("Mbah", user.getLastName());
    }

    @Test
    void testThatAUserTypeCanBeSet(){
        user.setUserType("Doctor");
        assertNotNull(user.getUserType());
    }

    @Test
    void testThatAUserC(){

    }
}