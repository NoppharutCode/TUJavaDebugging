package com.tu.debugging.visible;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students;

    public StudentRepository() {
        students = new ArrayList<Student>(5);

        // Add 5 student instances to the list
        for(int i = 0; i < 5; i++) {
            students.add(new Student(i, "Firstname" + i, "Lastname" + i, 20 + i));
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
