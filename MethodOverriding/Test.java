/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverriding1;

/**
 *
 * @author Ashvin Srivastava
 */

/** Parent method are not enough descriptive then we define it again in the child method called overriding binded at runtime **/  
class Parent 
{
    void property()
    {
        System.out.println("Car|Gold|Land");
    }
    void marry()
    {
        System.out.println("Laxmi|Satyavati");
    }
}
class Child extends Parent
{
    void marry()
    {
        System.out.println("Jenny|Jeniffer");   //I dont need much property but i will marry some hot one not Laxmi or Satyawati
     }
}
public class Test {
 public static void main(String args[])
 {
     Parent p=new Parent();
     p.marry();
     Child c=new Child();
     c.marry();
     Parent p1=new Child();
     p1.marry();
 }
}
