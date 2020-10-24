/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverloading1;

/**
 *
 * @author DELL-PC
 */
class A
{
    A()
    {
        System.out.println("No arg Constructor");
    }
    A(int a)
    {
        System.out.println("1 arg Constructor");
    }
    A(int a,int b)
    {
        System.out.println("2 arg Constructor");
    }
    void m1()
    {
        System.out.println("No-Argument method");
    }
     void m1(int n)
    {
        System.out.println("int-arg method");
    }
    void m1(double d)
    {
        System.out.println("double-arg method");
    }
     void m1(int a,int b)
    {
        System.out.println("double-arg method");
    }
}
public class Test {
    public static void main(String args[])
    {
        A a=new A();
        
        ///Overloading always binded at compile time thatswhy it is called early binding or compiletime polymorphism
        
        
        a.m1(23);
        a.m1();
        a.m1(10.55);
        A b=new A(2,3);
        a.m1();
        a.m1(2222);
        
    }
}
