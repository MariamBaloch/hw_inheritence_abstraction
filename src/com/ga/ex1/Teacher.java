package com.ga.ex1;

public class Teacher extends fullTimeInstructor implements ITeacherRole {

    private double salaryRate;

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void Teach(String subject) {
        System.out.println("Teacher " + this.getFirstName() + " " + this.getLastName() + " is teaching " + subject);
    }

    @Override
    public String toString() {
        return "Teacher " + this.getFirstName() + " " + this.getLastName() + "Salary rate is " + salaryRate;
    }
}
