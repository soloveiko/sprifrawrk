package jbrns.sprfrmwrk;

import java.util.List;

public class Triangle {

    private List<Point> pointList;

    public void draw() {
        for (Point point : pointList) {
            System.out.println("Point = (" + point.getX() + ", " + point.getY() + ")");
        }
    }

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

}
