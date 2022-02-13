package com.company.people;

public class Doctor extends Adam {


    @Override
    public String toString() {
        treat();
        return "Doctor{}";
    }

    protected void treat() {
        System.out.println("Doctor is treating");
    }


}
