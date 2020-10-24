/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverloading5;

/**
 *
 * @author DELL-PC
 */


/**************Ambiguity in number and type of Argument***************/ /**************Ambiguity in number and type of Argument***************/ 

class A 
{
    void m1(int i,float f)
    {
        System.out.println("int-float method");
    }
    void m1(float f,int i)
    {
        System.out.println("float-int method");
    }
}
public class Test {
    public static void main(String rgs[])
    {
        A a =new A();
        a.m1(10,5.5f);
        a.m1(5.5f,20);
        /// a.m1(10,20); Yes it is showing an error because system got confused int-->float and int-->int both possible
        
    }
    
}
