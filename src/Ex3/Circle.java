package Ex3;

public class Circle {
    private Point o = new Point(0, 0);
    private double r;
    public Circle(double x, double y, double r) {
        this.o.setXY(x, y);
        this.r = r;
    }
    public Circle(Point xy, double r) {
        this.o = xy;
        this.r = r;
    }

}
