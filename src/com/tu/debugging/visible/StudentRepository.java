package com.tu.debugging.visible;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentRepository {
    private List<Student> students;
    private List<Student> studentsWithBug;
    private Map<Integer, Student> studentMap;

    public StudentRepository() {
        students = new ArrayList<Student>(5);
        studentsWithBug = new ArrayList<Student>(6);
        // Add 5 student instances to the list
        for(int i = 0; i < 5; i++) {
            students.add(new Student(i, "Firstname" + i, "Lastname" + i, 20 + i));
        }

        studentMap = students.stream()
                .collect(Collectors.toMap(Student::getStudentId, Function.identity()));

        for(int i = 0; i < 5; i++) {
            studentsWithBug.add(new Student(i, "Firstname" + i, "Lastname" + i, 20 + i));
        }
        studentsWithBug.add(null);
        studentsWithBug.add(null);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> getStudentsWithBug() {
        return studentsWithBug;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<Integer, Student> getStudentMap() {
        return studentMap;
    }

}
