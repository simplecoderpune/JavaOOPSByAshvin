/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;
import java.util.*;
/**
 *
 * @author DELL-PC
 */

/*
   Abstraction is the process of details/implementation hiding. where we show only essential components or the frames of 
   classes..
   Abstract Class can contain abstract as well as concrete methods.
   
*/

abstract class Shape
{
    private String color;   //We know already that each shape will have some color
    Shape(String color)
    {
        this.color=color;
    }
    public abstract double getArea();  /* This is abstract class as it contains aadha-adhoora information */
    public String getColor()
    {
        return color;
    }
    public abstract String getInfo();
}
class Rectangle extends Shape
{
    int length;
    int breadth;
    Rectangle(String color,int l,int b)
    {
        super(color);
        this.length=l;
        this.breadth=b;                        //Now this class made the shape function implementation complete according to its requirement 
    }                                          //saved time bcz it makes the shape code reusable;
    public double getArea()
    {
        return length*breadth;
    }
    public String getInfo()
    {
        return "This is rectangle";
    }
}
class Circle extends Shape
{
    int radius;
    Circle(String color,int r)
    {
        super(color);
        this.radius=r;
    }
    public double getArea()
    {
        return (3.14*radius*radius);
    }
    public String getInfo()
    {
        return "I am circle";
    }
            
}
public class Test {
    public static void main(String args[])
    {
        Shape c=new Circle("Red",4);
        c.getArea();
        c.getInfo();
        c.getColor();
        
        Shape r=new Rectangle("Yellow",4,5);
        r.getArea();
        r.getColor();
        r.getInfo();
    }
    
}
