/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modifier1;

/**
 *
 * @author DELL-PC
 */

class A
{
    void ma1()
    {
        System.out.println("m1 from A");
    }
    public void ma2()
    {
        System.out.println("m2 from A");
    }
}
class B extends A
{
    public void mb1(){
    System.out.println("m1 from B");
}
    void mb2(){
    System.out.println("m2 from B");
}
}
public class Test {
    public static void main(String args[])
    {
      A a=new A();     // Default is accessible  anywhere in the same package  
      
      a.ma1();
      a.ma2();
     // a.mb1();    //raise compile time error
        
      
      B b =new B();
      b.mb1();
      b.mb2();
      b.ma1();
      b.ma2();   //These are all basically child class object with child reference
      
      A a1 =new B();
      a1.ma1();
      a1.ma2();
     /// a1.mb1(); although A is inherited by B and we are giving reference but new will work at runtime so at compile time it does not know
      
    // B b1=new A();   Child Class object cant be given parent reference
    }
}
