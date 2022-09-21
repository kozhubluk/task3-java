package Ex4;

public class Computer {
    private int number;
    private String name;
    public Computer(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNum() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
