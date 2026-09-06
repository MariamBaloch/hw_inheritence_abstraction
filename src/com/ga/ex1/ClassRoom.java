package com.ga.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassRoom {
    private String className;
    private Teacher teacher;
    private List<Student> studentList;

    public ClassRoom(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void getStudentList() {
        System.out.println("Students in " + className + ":");
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    @Override
    public String toString() {
        return "Classroom: " + className + " " + teacher.toString() + " Total Students: " + studentList.size();
    }
}
