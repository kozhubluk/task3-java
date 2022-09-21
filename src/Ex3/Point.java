package Ex3;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
}
