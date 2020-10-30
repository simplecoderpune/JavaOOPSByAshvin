/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverriding3;

/**
 *
 * @author DELL-PC
 */

/******  Before 1.4v return type must be same ***********/  /****   Co-Variant return types allowed in Overriding after 1.4v ****/

class A
{
    Object m1()
    {
        System.out.println("Ashvin");
        return new Object();
    }
}

class B extends A
{
    String m1()                // String is the child class of Object hence it is allowed so child class return type is allowed in child class only
    {
        System.out.println("Ashvin Sri");
        return new String("Ashvin");
    }
}

public class Test {
    public static void main(String args[])
    {
        B b=new B();
        System.out.println(b.m1());
    }
    
}
