package com.hospitalRegistrationSystem;

public enum UserTypes {
    DOCTOR, NURSE, PATIENT, VISITOR, PHARMACIST, RECEPTIONIST;

    public String toString(){
        return switch(this){
            case DOCTOR -> "Doctor";
            case NURSE -> "Nurse";
            case VISITOR -> "Regular";
            case PHARMACIST -> "Pharmacist";
            case PATIENT -> "patient";
            case RECEPTIONIST -> "Receptionist";
            default -> throw new IllegalArgumentException("User type does not exist");
        };
    }
}
