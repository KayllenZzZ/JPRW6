package ru.mirea.ikbo2519.jprw5.ex1;

import java.util.List;

public class Student {
    private String studentName;
    private int studentId;

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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public static void sortById(List <Student> studentsMass) {
        for (int i = 1; i < studentsMass.size(); i++)
        {
            Student temp;
            for (int j = i; j > 0; j--)
            {
                if (studentsMass.get(j).getStudentId() <= studentsMass.get(j - 1).getStudentId())
                {
                    temp = studentsMass.get(j);
                    studentsMass.set(j, studentsMass.get(j - 1));
                    studentsMass.set(j - 1, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\n" + "Student name: " + studentName +
                ", student id: " + studentId;
    }

}


