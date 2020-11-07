package ru.mirea.ikbo2519.jprw5.ex3;

import java.util.ArrayList;
import java.util.List;

public interface Comparator {
    private static void mergeScore(List<Student> a, List<Student> l, List<Student> r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i).getStudentScore() >= r.get(j).getStudentScore()) {
                a.set(k++, l.get(i++));
            }
            else {
                a.set(k++, r.get(j++));
            }
        }
        while (i < left) {
            a.set(k++, l.get(i++));
        }
        while (j < right) {
            a.set(k++, r.get(j++));
        }
    }

    static void mergeSortScore(List<Student> a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n/2;
        List<Student>l = new ArrayList<>();
        for (int i = 0; i < a.size()/2; i++){
            l.add(null);
        }
        List<Student>r = new ArrayList<>();
        for (int i = a.size()/2; i < a.size(); i++){
            r.add(null);
        }
        for (int i = 0; i < mid; i++) {
            l.set(i, a.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.set(i - mid, a.get(i));
        }
        mergeSortScore(l, mid);
        mergeSortScore(r, n - mid);

        mergeScore(a, l, r, mid, n - mid);
    }

    private static void mergeId(List<Student> a, List<Student> l, List<Student> r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i).getStudentId() <= r.get(j).getStudentId()) {
                a.set(k++, l.get(i++));
            }
            else {
                a.set(k++, r.get(j++));
            }
        }
        while (i < left) {
            a.set(k++, l.get(i++));
        }
        while (j < right) {
            a.set(k++, r.get(j++));
        }
    }

    static void mergeSortId(List<Student> a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n/2;
        List<Student>l = new ArrayList<>();
        for (int i = 0; i < a.size()/2; i++){
            l.add(null);
        }
        List<Student>r = new ArrayList<>();
        for (int i = a.size()/2; i < a.size(); i++){
            r.add(null);
        }
        for (int i = 0; i < mid; i++) {
            l.set(i, a.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.set(i - mid, a.get(i));
        }
        mergeSortId(l, mid);
        mergeSortId(r, n - mid);

        mergeId(a, l, r, mid, n - mid);
    }
}