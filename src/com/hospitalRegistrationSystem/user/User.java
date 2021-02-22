package com.hospitalRegistrationSystem.user;

public class User {
    private String fullName;
    private String firstName;
    private String middleName;
    private String lastName;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + (middleName.equals("") ? "" + lastName : middleName + " " + lastName);
    }
}
