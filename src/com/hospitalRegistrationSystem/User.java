package com.hospitalRegistrationSystem;

public class User{

    private String firstName;
    private String lastName;
    protected static int userId;
    private UserTypes userType;

    public User(){
        userId += 1;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserType(UserTypes userType){
        this.userType = userType;
    }

    public void setUserType(String userType) {
        switch(userType){
            case "Doctor", "Doc" -> setUserType(UserTypes.DOCTOR);
            case "Nurse" -> setUserType(UserTypes.NURSE);
            case "Patient" -> setUserType(UserTypes.PATIENT);
            case "Pharmacist" -> setUserType(UserTypes.PHARMACIST);
            case "Receptionist" -> setUserType(UserTypes.RECEPTIONIST);
            case "Visitor" -> setUserType(UserTypes.VISITOR);
        }
    }

    public UserTypes getUserType() {
        return userType;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
