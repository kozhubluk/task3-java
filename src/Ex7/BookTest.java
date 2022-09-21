package Ex7;

import java.util.Arrays;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] book = new Book[2];
        for(int i=0; i<2; i++){
            book[i] = new Book(sc.next(), sc.next(), sc.nextInt());
        }
        System.out.println(book[0].getAuthor() + " " + book[0].getName() + " " + book[0].getAuthor());
        System.out.println(book[1]);
        book[1].setAuthor(sc.next());
        book[1].setName(sc.next());
        book[1].setYear(sc.nextInt());
    }
}