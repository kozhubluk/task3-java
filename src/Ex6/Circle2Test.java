package Ex6;

import java.util.Scanner;

public class Circle2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle2 c1 = new Circle2(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        Circle2 c2 = new Circle2(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Длина 1ой окружности: "  + String.format("%.2f", c1.length()) + " длина 2ой: " + String.format("%.2f", c2.length()));
        System.out.println("площадь 1ой окружности: "  + String.format("%.2f", c1.square()) + " площадь 2ой: " + String.format("%.2f", c2.square()));
        if(c1.more(c2) == 1){
            System.out.println("1 окржность больше");
        }
        else if (c1.more(c2) == -1)
        {
            System.out.println("2 окржность больше");
        }
        else
        {
            System.out.println("окружности равны");
        }
    }
}
