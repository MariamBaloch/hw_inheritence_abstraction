package com.ga.ex1;


public class Demo {
    public static void main(String[] args) {

        School school = new School();
        school.setCampusName("General Assembly");

        Teacher teacher1 = new Teacher("Sara", "Ahmed", 45000.00);
        Teacher teacher2 = new Teacher("Fatima", "Mahmoud", 46500.00);

        ClassRoom room4 = new ClassRoom("4th Grade", teacher1);
        ClassRoom room2 = new ClassRoom("2nd Grade", teacher2);

        Student student1 = new Student("Omar", "Ali", 2.1);
        Student student2 = new Student("Youssef", "Ibrahim", 3.2);
        Student student3 = new Student("Zaid", "Hassan", 1.5);
        Student student4 = new Student("Layla", "Ali", 4.0);

        room4.addStudent(student1);
        room4.addStudent(student2);

        room2.addStudent(student3);
        room2.addStudent(student4);

        school.addClassRoom(room4);
        school.addClassRoom(room2);

        school.displaySchoolInfo();

    }
}