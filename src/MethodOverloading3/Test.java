/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverloading3;

/**
 *
 * @author DELL-PC
 */


/*** First Search for an Exact method if not avaialable then goes to parent  ******/ 
public class Test {
void m1(Object o)    
{
    System.out.println("Object-Version"+o);
}

void m1(String str)    
{
    System.out.println("String-Version"+str);
}

public static void main(String args[])
{
 Test t1=new Test();
 t1.m1(new Object());
 t1.m1("Durga");         //First it will check for an exact match
 t1.m1(null);           //First of all it will check for child method if not match then it will go to parent so string method
}
}
