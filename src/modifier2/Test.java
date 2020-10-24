/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifier2;
import Modifier1.Test1;
import modifier1.*;
/**
 *
 * @author DELL-PC
 */


class D extends A
{
    public static  void main(String args[])
    {
       /// A a= new A();   Defaul members are not accessible outside the package in any circumstances
       
    }
}
class E extends Test1
{
    public void me1()
    {
        System.out.println("OK");
        //// m2();   Protected members can only be accessible in child class
    }
    public static void main(String args[])
    {
        E e1=new E();
        e1.m1();
        e1.m2(); ///protected
        
        Test1 t1=new Test1();
        t1.m1();
        //t1.me1();
         //t1.m2(); we cant access protected members in child class using parent class object 
         Test1 t2=new E();
         t2.m1();
         ///////t2.m2();
       ///  t2.me1();
    }
}
public class Test {
 public static void main(String args[])
 {
   Test1 t1=new Test1();
   t1.m1();
   E e1=new E();
   e1.m1();
   //e1.m2();
 }
}
