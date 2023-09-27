package com.tu.debugging.visible;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private int age;

    public Student(int studentId, String firstName, String lastName, int age) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printFullDetails() {
        System.out.println("Student id: " + this.studentId);
        System.out.println("Student first name: " + this.firstName);
        System.out.println("Student last name: " + this.lastName);
        System.out.println("Student age: " + this.age);
    }
}
