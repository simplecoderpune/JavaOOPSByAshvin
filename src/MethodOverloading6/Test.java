/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverloading6;

/*** Method Overloading in Inheritance ***/

class A
{
}
class B extends A
{
}
public class Test {
    void m1(A a)
    {
        System.out.println("Parent class");
    }
    void m1(B a)
    {
        System.out.println("Child  class");
    }
    public static void main(String args[])
    {
        A a=new A();
        Test t=new Test();
        t.m1(a);
        B b=new B();
        t.m1(b);
        A a1=new B();
        t.m1(a1);   // Parent method will execute as we all know that in overloading method resolution binded at compile-time
    }
}
