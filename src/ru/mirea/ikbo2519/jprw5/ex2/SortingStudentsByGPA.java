package ru.mirea.ikbo2519.jprw5.ex2;

import ru.mirea.ikbo2519.jprw5.ex1.Student;

public class SortingStudentsByGPA implements Comparator {
    private String studentName;
    private int studentId;

    public SortingStudentsByGPA(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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
                ", student id: " + studentId;
    }
}




