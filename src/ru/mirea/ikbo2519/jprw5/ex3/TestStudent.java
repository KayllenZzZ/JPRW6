package ru.mirea.ikbo2519.jprw5.ex3;

import java.util.*;
import  java.util.List;

public class TestStudent extends Student {

    public TestStudent(String studentName, int studentId, int studentScore) {
        super(studentName, studentId, studentScore);
    }

    public TestStudent(String studentName, int studentId) {
        super(studentName, studentId);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Liza", 15, 348));
        students.add(new Student("Leon", 14, 557));
        students.add(new Student("Mark", 16, 102));
        students.add(new Student("Andrew", 3));
        students.add(new Student("Alice", 7, 895));
        System.out.println(students);
        Comparator.mergeSortScore(students,students.size());
        System.out.println(students);
        students.get(0).setStudentId(14);
        Comparator.mergeSortId(students,students.size());
        System.out.println(students);
    }

}
