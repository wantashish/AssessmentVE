package uk.co.amazon.main;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: ashishsri
 * Date: 01/05/2014
 * Time: 23:57
 * To change this template use File | Settings | File Templates.
 */
public class Painting {
    Point x,y;
    int width, height, radius;

    Painting(Point a, Point b,int w, int h, int r){
        x=a;
        y=b;
        width=w;
        height=h;
        radius=r;
    }

    Shape drawLine(){
        return new Line(x,y);
    }

    Shape drawSquare(){
        return new Square(x,width,height);
    }

    Shape drawCircle(){
        return new Circle(x,radius);
    }

    public static void main(){
        Shape pic;
        Painting pt;
        pt = new Painting(new Point(0,0), new Point(10,10), 5, 5, 3);


    }
}
