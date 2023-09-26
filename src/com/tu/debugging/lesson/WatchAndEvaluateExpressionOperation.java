package com.tu.debugging.lesson;

import com.tu.debugging.visible.Student;
import com.tu.debugging.visible.StudentRepository;

import java.util.List;

public class WatchAndEvaluateExpressionOperation {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        List<Student> students = studentRepository.getStudents() ;

        for(int i = 0  ; i < students.size() ;  i++) {
            Student student = students.get(0);
            System.out.println("Student first name: " +student.getFirstName());
        }
    }
}
