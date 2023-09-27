package com.tu.debugging.lesson;

import com.tu.debugging.visible.Student;
import com.tu.debugging.visible.StudentRepository;

import java.util.List;

public class FieldWatchPoint {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();

        List<Student> students  = studentRepository.getStudents();

        students.get(0).setFirstName("Change First Name");
        System.out.println(students.get(0).getFirstName());
        System.out.println(students.get(0).getLastName());
    }
}
