
package com.mycompany.shapes;
public class Circle extends Shapes
{
    private double radius;
    
    public Circle(int r)
    {
        this.radius=r;
    }
    
    public void calculateArea()
    {
        area=radius*radius*pi;
    }
    
}
