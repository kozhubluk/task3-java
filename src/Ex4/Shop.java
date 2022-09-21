package Ex4;

import java.util.ArrayList;

public class Shop {
    private int amount;
    ArrayList<Computer> computers = new ArrayList<>();

    public Shop() {
        this.amount = 0;
    }

    public void addComputer(int num, String name) {
        Computer c = new Computer(num, name);
        computers.add(c);
        amount++;
    }

    public Computer find(int num) {
        for (int i = 0; i < amount; i++) {
            if (computers.get(i).getNum() == num) return computers.get(i);
        }
        return new Computer(0, "");
    }

    public void DelComputer(int num) {
        for (int i = 0; i < amount; i++) {
            if (computers.get(i).getNum() == num)  {computers.remove(i); amount--;}
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "amount=" + amount +
                ", computers=" + computers +
                '}';
    }
}
