package ru.mirea.ikbo2519.jprw5.ex2;

import java.util.ArrayList;
import java.util.List;

public class TestSortRating extends SortingStudentsByGPA{
    public TestSortRating(String studentName, int studentId) {
        super(studentName, studentId);
    }

    public static void main(String[] args) {
       List <SortingStudentsByGPA> s = new ArrayList<SortingStudentsByGPA>();
       s.add(new SortingStudentsByGPA("Liza", 12));
        s.add(new SortingStudentsByGPA("Martin", 1));
        s.add(new SortingStudentsByGPA("Gordon", 15));
        System.out.println(s);
        Comparator.Sort(s, 0, s.size()-1);
        System.out.println(s);
        s.get(0).setStudentId(15);
        System.out.println(s);
        Comparator.Sort(s, 0, s.size()-1);
        System.out.println(s);
    }
}
