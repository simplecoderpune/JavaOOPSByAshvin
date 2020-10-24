/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverloading4;

/**
 *
 * @author DELL-PC
 */

/************Overloading at same level as String and StringBuffer are at same level so compiler is confused ******************************************/
/************     Object    **************/
/**********      -     -    *************/
/*********     -         -  ************/
/********  String       StringBuffer *******/                                                                                             

public class Test {
    void m1(String s)
    {
        System.out.println("String method");
    }
     void m1(StringBuffer sbuf)
    {
        System.out.println("String Buffer method");
    }
     public static void main(String args[])
     {
         Test t1=new Test();
         t1.m1("Ashvin");
         t1.m1(new StringBuffer("Ashvin"));
        // t1.m1(null);   here compiler is confused who will get null bcz both at same level
     }
}
