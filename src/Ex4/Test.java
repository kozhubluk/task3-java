package Ex4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shop s = new Shop();
        Scanner sc = new Scanner(System.in);
        int amount;
        int number;
        amount = sc.nextInt();
        for (int i = 0; i < amount; i++) s.addComputer(sc.nextInt(), sc.next());
        System.out.println(s+"\nнайти компьютер ");
        number = sc.nextInt();
        System.out.println(s.find(number)+"\nудалить компьютер ");
        number = sc.nextInt();
        s.DelComputer(number);
        System.out.println(s);
    }
}
