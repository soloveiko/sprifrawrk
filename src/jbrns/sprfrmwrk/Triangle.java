package jbrns.sprfrmwrk;


public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;
/*
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean init method call for Triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean's destroy method call for Triangle");
    }*/

    public void myInit() {
        System.out.println("My init method call for Triangle");
    }

    public void myDestroy() {
        System.out.println("My destroy method call for Triangle");
    }

    public void draw() {
        System.out.println("Point A = (" + getPointA().getX() +", " + getPointA().getY()+")");
        System.out.println("Point B = (" + getPointB().getX() +", " + getPointB().getY()+")");
        System.out.println("Point C = (" + getPointC().getX() +", " + getPointC().getY()+")");
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
