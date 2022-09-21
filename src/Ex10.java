import java.util.Scanner;

public class Ex10  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        int count = 0;
        // слова считаются, пока на ввод не будет подаан пустая строка
        while(input.length() != 0){
            while(input.contains("  ")) input = input.replace("  ", " "); // убираем повторяющиеся пробелы
            count += (input.split(" ")).length;
            input = sc.nextLine();
        }

        System.out.println("Вы ввели "+count+" слов");
    }
}

