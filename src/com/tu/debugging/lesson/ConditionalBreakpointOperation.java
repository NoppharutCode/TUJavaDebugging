package com.tu.debugging.lesson;

import com.tu.debugging.visible.Student;
import com.tu.debugging.visible.StudentRepository;

import java.util.List;

public class ConditionalBreakpointOperation {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();

        int[] numberArray = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        for (int number : numberArray) {
            int result = squareNumber(number);
            System.out.println("The square of " + number + " is " + result);
        }

        List<Student> students = studentRepository.getStudentsWithBug();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.printf("Student First Name: %s, Last Name: %s, Age: %d%n", student.getFirstName(), student.getLastName(), student.getAge());
        }
    }

    public static int squareNumber(int num) {
        return num * num;
    }
}
