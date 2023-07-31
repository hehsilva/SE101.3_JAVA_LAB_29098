
package com.mycompany.shapes;
public class Rectangle extends Shapes 
{
    private double length, width;
    
    public Rectangle(double l, double w)
    {
        this.width=w;
        this.length=l;
    }
    
    public void calculateArea()
    {
        area=length*width;     
    }
}
