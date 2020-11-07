package ru.mirea.ikbo2519.jprw5.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStudentsSort extends Student{
    public TestStudentsSort(String studentName, int studentId) {
        super(studentName, studentId);
    }

    public static void main(String[] args) {
         List <Student> s = new ArrayList<Student>();
        s.add(new Student("Andrew Miller", 1));
        s.add(new Student("Liza Miller", 12));
        s.add(new Student("Gabe Morales", 2));
        System.out.println(s);
        sortById(s);
        System.out.println(s);
        s.add(new Student("Andrew Jonson", 9));
        s.add(new Student("Hikaru Lo", 14));
        s.add(new Student("Sikiru Mi", 15));
        System.out.println(s);
        sortById(s);
        System.out.println(s);
    }
}
