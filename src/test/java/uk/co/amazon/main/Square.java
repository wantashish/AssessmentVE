package uk.co.amazon.main;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: ashishsri
 * Date: 01/05/2014
 * Time: 23:53
 * To change this template use File | Settings | File Templates.
 */
public class Square implements Shape {

    Point start;
    int width,height;

    Square(Point s, int w, int h){
        start=s;
        width=w;
        height=h;
    }

    @Override
    public void draw() {
        //draw a square
    }
}
