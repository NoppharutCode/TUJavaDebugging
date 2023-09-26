package com.tu.debugging.lesson;

import com.tu.debugging.visible.Student;

public class SmartStepIntoAndRunToCursorDebuggingOperation {
    public static void main(String[] args) {
        Student student1 = new Student(
                1,
                "Hello",
                "World",
                18
        );

        Student student2 = new Student(
                2,
                "Nop",
                "Phi",
                18
        );

        System.out.println("Student list");

        System.out.println("Student id: " + student1.getStudentId() + " First name: " + student1.getFirstName() + " Last name: " + student1.getLastName() + " Age: " + student1.getAge());

        System.out.println("Student id: " + student2.getStudentId() + " First name: " + student2.getFirstName() + " Last name: " + student2.getLastName() + " Age: " + student2.getAge());
    }
}
