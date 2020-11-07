package ru.mirea.ikbo2519.jprw5.ex2;

import java.util.List;

public interface Comparator {
    public static void Sort(List<SortingStudentsByGPA> source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source.get((leftMarker + rightMarker) / 2).getStudentId();
        do {
            while (source.get(leftMarker).getStudentId() < pivot) {
                leftMarker++;
            }
            while (source.get(rightMarker).getStudentId() > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    SortingStudentsByGPA tmp = source.get(leftMarker);
                    source.set(leftMarker, source.get(rightMarker));
                    source.set(rightMarker, tmp);
                }

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            Sort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            Sort(source, leftBorder, rightMarker);
        }
    }
}

