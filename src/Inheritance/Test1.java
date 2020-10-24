/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author DELL-PC
 */
class A
{
    public void m1()
    {
        System.out.println("Parent");
    }
}
class B extends A
{
    public void m2()
    {
        System.out.println("Child");
    }
}
public class Test1 {
    public static void main(String args[])
    {
        A a=new A(); 
        a.m1();
      //  a.m2();     //Cant do this
        
        A a1=new B();
        a1.m1();
       // a1.m2();    //not allowed bcz B is bounded at runtime   
    }        
}
