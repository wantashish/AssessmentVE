package uk.co.amazon.main;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: ashishsri
 * Date: 01/05/2014
 * Time: 23:55
 * To change this template use File | Settings | File Templates.
 */
public class Circle implements Shape {
    Point centre;
    int radius;

    Circle(Point c, int r){
        centre=c;
        radius=r;
    }

    @Override
    public void draw() {
        //draw a circle
    }
}
