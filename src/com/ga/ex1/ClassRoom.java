package com.ga.ex1;

import java.util.Arrays;

public class ClassRoom {
    private String className;
    private Teacher teacher;
    private Student[] studentList;

    public ClassRoom(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Class Name: " +  this.className + " Teacher: " + this.teacher + " Student List: " + Arrays.toString(studentList);
    }
}
