
package com.mycompany.cylindermain;
public class Cylindricalcontainer extends Container  
{
    private double height, radius;
    
    public Cylindricalcontainer(double h , double r)
    {
     height=h;
     radius=r;
    }
 public double volume ()
 {
     return 3.14159*radius*radius*height;
 }
}6