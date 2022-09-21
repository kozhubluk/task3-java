package Ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Pitomnik {
    private int amount;
    private ArrayList<Dog> dogs = new ArrayList<>();
    public Pitomnik(){
        this.amount = 0;
    }
    public Pitomnik(ArrayList<Dog> dogs) {this.amount = dogs.size();}
    public void addDog(String name, int age) {
        dogs.add(new Dog(name, age));
        amount++;
    }
    public Dog getDog(int num) {
        return dogs.get(num);
    }
    @Override
    public String toString() {
        return "Pitomnik{" +
                "amount=" + amount +
                ", dogs=" + dogs +
                '}';
    }

    public static void main(String[] args) {
        Pitomnik p = new Pitomnik();
        Scanner sc = new Scanner(System.in);
        int am, n;
        am = sc.nextInt();
        for (int i = 0; i < am; i++) {
            p.addDog(sc.next(), sc.nextInt());
        }
        System.out.println(p);
        Dog dogFirst = new Dog(sc.next(), sc.nextInt());
        System.out.println(dogFirst.getNewAge());
    }
}
