package com.tu.debugging.lesson;

import com.tu.debugging.visible.Student;
import com.tu.debugging.visible.StudentRepository;

import java.util.List;
import java.util.Map;

public class VariableConsoleOperation {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();

        String helloVariableConsole = "Hello variable Console";
        System.out.println("Hello TU:" + helloVariableConsole);

        List<Student> students = studentRepository.getStudents();
        System.out.println("Student list size: " + students.size());

        Map<Integer, Student> studentMap = studentRepository.getStudentMap();
        System.out.println("Student map size: " + studentMap.size());

        System.out.println("First Student Id: " + students.get(0).getStudentId());

        for(int i = 0  ; i < students.size() ;  i++) {
            Student student = students.get(0);
            System.out.println("Student first name: " +student.getFirstName());
        }
    }
}
