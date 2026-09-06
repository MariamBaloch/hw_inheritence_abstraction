package com.ga.ex1;

public class Student extends Person implements IStudentRole {
    private double currentGrade;

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public Student(String firstName, String lastName, double currentGrade) {
        super(firstName, lastName);
        this.currentGrade = currentGrade;
    }

    @Override
    public void Learn() {
        System.out.println("Student Learn");
    }

    @Override
    public String toString() {
        return "Student " + this.getFirstName() + " " + this.getLastName() + "Salary rate is " + currentGrade;
    }
}
