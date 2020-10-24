/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**********   AUTOMATIC PROMOTION IN OVERLOADING   *********/  /**********   AUTOMATIC PROMOTION IN OVERLOADING   *********/ /**********   AUTOMATIC PROMOTION IN OVERLOADING   *********/


package MethodOverloading2;

/**
 *
 * @author DELL-PC
 */
public class Test {
    void m1(int i)
    {
        System.out.println("Integer-Arg Method"+i);
    }
    void m1(float f)
    {
        System.out.println("Float-Arg Method"+f);             //byte-->short-->int-->long-->float-->double
    }                                                                       
    public static void main(String args[])                              //charint-->long-->float-->double
    {
        Test t1=new Test();
        t1.m1(12);
        t1.m1(10.5f);
        t1.m1('a');
        t1.m1(10l);
    //t1.m1(10.5);  Error because no matching pattern 
    }
    
}
