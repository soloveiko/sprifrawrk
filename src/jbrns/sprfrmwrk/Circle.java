package jbrns.sprfrmwrk;

public class Circle implements Shape {

    private Point center;

    @Override
    public void draw() {
        System.out.println("Point is: (" + center.getX() + ", " + center.getY() + ")");
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

}
