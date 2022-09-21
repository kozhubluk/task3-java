package Ex1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        Author test = new Author ("Jack", "jkfff@ya.ru", 'm');
        // геттеры
        System.out.println("имя: " + test.getName());
        System.out.println("email: " + test.getEmail());
        System.out.println("пол: " + test.getGender());
        // сеттер
        String newEmail;
        Scanner sc = new Scanner(System.in);
        newEmail = sc.nextLine();
        // to string
        test.setEmail(newEmail);
        System.out.println(test);
    }
}
