/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractMethod;

/**
 *
 * @author DELL-PC
 */
abstract class Vehichle                                     //If any class contains at least one abstract method then class must be abstract
{
    public void get_wheel1()
    {
        
    }
    //public void get_wheel2();    There must be implementation of non abstract method;
    /*public abstract void get_wheel3()
    {           abstraction method cant have body
    }*/
   public abstract void get_wheel4();
}

public class Test extends Vehichle {
   public void get_wheel4()
    {
        System.out.println("Working fine");
    }
   public static void main(String args[])
   {
       Test t1=new Test();
       t1.get_wheel4();
   }
}
