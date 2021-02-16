package com.hospitalRegistrationSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    Date birthDate;
    Exception exception;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        birthDate = new Date(12,6,2012);
        user = new User("Amaka", "Rita", "Mbah", UserTypes.PATIENT);
        User.userId = 0;
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        birthDate = null;
        user = null;
    }

    @Test
    void testThatDefaultUserValuesCanBeSet(){
        assertNotNull(user);
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
    void testThatAUserMiddleNameCanBeSet(){
        user.setMiddleName("Rita");
        assertEquals("Rita", user.getMIddleName());
    }

    @Test
    void testThatAUserLastNameCanBeSet(){
        user.setLastName("Mbah");
        assertEquals("Mbah", user.getLastName());
    }

    @Test
    void testDefaultValuesForDateOfBirth(){
        assertEquals("12/6/2012", birthDate.getDateOfBirth());
    }

    @Test
    void testThatDayOfBirthCanBeUpdated(){
        birthDate.setDay(7);
        assertEquals(7, birthDate.getDay());
    }

    @Test
    void testThatMonthOfBirthCanBeUpdated(){
        birthDate.setMonth(5);
        assertEquals(5, birthDate.getMonth());
    }

    @Test
    void testThatYearOfBirthCanBeUpdated(){
        birthDate.setYear(2012);
        assertEquals(2012,birthDate.getYear());
    }

    @Test
    void testThatAUserTypeCanBeSet(){
        user.setUserType("Doctor");
        assertNotNull(user.getUserType());
    }

    @Test
    void testThatDayOfBirthIsNotInvalid(){
       exception = assertThrows(IllegalArgumentException.class, () -> {
           birthDate.setDay(32);
       });
       assertEquals("Invalid day", exception.getMessage());
    }

    @Test
    void testThatMonthOfBirthIsNotInvalid(){
        exception = assertThrows(IllegalArgumentException.class, () ->{
            birthDate.setMonth(15);
        });
        assertEquals("Invalid month", exception.getMessage());
    }

    @Test
    void testThatYearOfBirthIsNotInvalid(){
        exception = assertThrows(IllegalArgumentException.class, () ->{
            birthDate.setYear(1890);
        });
        assertEquals("Invalid year", exception.getMessage());
    }

}