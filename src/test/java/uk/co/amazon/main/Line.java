package uk.co.amazon.main;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: ashishsri
 * Date: 01/05/2014
 * Time: 23:51
 * To change this template use File | Settings | File Templates.
 */
public class Line implements Shape {
    Point x,y;
    Line (Point a, Point b){
        x=a;
        y=b;
    }

    @Override
    public void draw() {
        //draw a line
    }
}
