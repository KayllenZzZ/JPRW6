package ru.mirea.ikbo2519.jprw5.ex3;

import java.util.List;

public class Student implements Comparator {
    private String studentName;
    private int studentId;
    private int studentScore;

    public Student (String studentName, int studentId, int studentScore) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentScore = studentScore;
    }

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(int studentScore) {
        this.studentScore = studentScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "\n" + "Student name: " + studentName +
                ", student id: " + studentId + ", student score: " + studentScore;
    }

}
