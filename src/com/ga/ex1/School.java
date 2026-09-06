package com.ga.ex1;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String campusName;
    private ClassRoom classRoom;
    private List<ClassRoom> classRoomList;

    public School() {
        this.classRoomList = new ArrayList<>();
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public void addClassRoom(ClassRoom classRoom) {
        this.classRoomList.add(classRoom);
    }

    public void displaySchoolInfo() {
        System.out.println(campusName);
        if (classRoom != null) {
            System.out.println("Classroom: " + classRoom.toString());
        }

        for (ClassRoom cr : classRoomList) {
            System.out.println(cr.toString());
            cr.getStudentList();
            System.out.println();
        }
    }
}
