package Ex6;

public class Circle2 {
    private double x =0.0;
    private double y =0.0;
    private double radius = 1.0;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public Circle2(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.radius=r;
    }
    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double square(){
        return 3.14 * 3.14 * radius;
    }
    public double length(){
        return(2 * 3.14 * radius);
    }
    public int more(Circle2 c){
        if (this.radius>c.getRadius()) return 1;
        if (this.radius == c.getRadius()) return 0;
        return -1;
    }
}