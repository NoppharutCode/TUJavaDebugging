package com.tu.debugging.workshop.workshop3;

import java.util.Arrays;
import java.util.List;

public class AutoGradingSystem {
    public static void main(String[] args) {
        // Correct answers for the questions
        List<Character> answerKey = Arrays.asList('B', 'D', 'A', 'C', 'C', 'D', 'A', 'B', 'C', 'D');
        // Mock students with their given answers
        Student john = new Student("John", Arrays.asList('B', 'D', 'C', 'C', 'C', 'D', 'A', 'B', 'C', 'D'));
        Student mary = new Student("Mary", Arrays.asList('A', 'B', 'A', 'C', 'C', 'D', 'A', 'B', 'D', 'A'));
        Student peter = new Student("Peter", Arrays.asList('B', 'D', 'A', 'C', 'C', 'D', 'A', 'B', 'C', 'D'));
        Student tee = new Student("Tee", Arrays.asList('B', 'D', 'A', 'C', 'C', 'D', 'A', 'B', 'C'));

        List<Student> students = Arrays.asList(john, mary, tee, peter);

        for(Student student : students) {
            gradeExam(student, answerKey);
            System.out.println("Grading completed for: " + student.getName());
        }
    }

    public static void gradeExam(Student student, List<Character> answerKey) {
        List<Character> studentAnswers = student.getAnswers();
        int score = 0;

        for (int i = 0; i < answerKey.size(); i++) {
            if (studentAnswers.get(i).equals(answerKey.get(i))) {
                score += 10;
            }
        }

        System.out.println(student.getName() + "'s score: " + score);
    }

    public static class Student {
        private String name;
        private List<Character> answers;

        public Student(String name, List<Character> answers) {
            this.name = name;
            this.answers = answers;
        }

        public String getName() {
            return name;
        }

        public List<Character> getAnswers() {
            return answers;
        }
    }
}
