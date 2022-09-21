package Ex2;

import java.util.Scanner;

public class BallTest {
    public static  void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(3, 5.3);
        System.out.println(ball1);
        System.out.println(ball2);

        System.out.println("Введите новое значение координат для первого мяча");
        Scanner sc = new Scanner(System.in);
        double newX, newY;
        newX = sc.nextDouble();
        newY = sc.nextDouble();
        ball1.setX(newX);
        ball1.setY(newY);
        System.out.println(ball1.getX() + "  " + ball1.getY());

        System.out.println("Введите новое значение координат для второго мяча");
        newX = sc.nextDouble();
        newY = sc.nextDouble();
        ball2.setXY(newX, newY);
        System.out.println(ball2.getX() + "  " + ball2.getY());

        System.out.println("Введите смещение для второго мяча");
        double xm, ym;
        xm = sc.nextDouble();
        ym = sc.nextDouble();
        ball2.move(xm, ym);
        System.out.println(ball2);
    }
}
