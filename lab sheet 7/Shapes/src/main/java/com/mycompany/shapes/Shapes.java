
package com.mycompany.shapes;
public abstract class Shapes 
{
    final double pi=3.14159;
    public  abstract void  calculateArea();
    protected double area;
    public void display()
    {
        System.out.println("Area:"+area);
    }
    public static void main(String[] args)
    {
        Circle C1=new Circle(7);
        C1.calculateArea();
        C1.display();
        
        Rectangle R1=new Rectangle(4,5);
        R1.calculateArea();
        R1.display();
    }
}
