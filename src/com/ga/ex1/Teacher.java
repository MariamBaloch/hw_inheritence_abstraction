package com.ga.ex1;

public class Teacher extends fullTimeInstructor implements ITeacherRole {

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Teacher(String firstName, String lastName, double salaryRate) {
        super(firstName, lastName);
        this.salaryRate = salaryRate;
    }

    @Override
    public void Teach(String subject) {
        System.out.println(this.firstName + " " + this.lastName + " is teaching " + subject);
    }

    @Override
    public String toString() {
        return "Teacher: " + firstName + " " + lastName + " Salary rate: $" + salaryRate;
    }
}
