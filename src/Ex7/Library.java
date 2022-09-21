package Ex7;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private int n;
    private Book[] bookArray;

    public Library(Book[] bookArray) {
        this.bookArray = bookArray;
        this.n = bookArray.length;
    }

    public Book last() { // получить книгу с поздним годом издания
        Book max = bookArray[0];
        for (int i = 1; i < n; i++) {
            if (bookArray[i].getYear() > max.getYear()) max = bookArray[i];
        }
        return max;
    }

    public Book first() { // получить книгу с самым ранним годом издания
        Book min = bookArray[0];
        for (int i = 1; i < n; i++) {
            if (bookArray[i].getYear() < min.getYear()) min = bookArray[i];
        }
        return min;
    }

    public void sortBook() { // сортировка по году
        Arrays.sort(bookArray, Comparator.comparing(Book::getYear));
    }

    @Override
    public String toString() {
        return "Library{" +
                "n=" + n +
                ", bookArray=" + Arrays.toString(bookArray) +
                '}';
    }
}
