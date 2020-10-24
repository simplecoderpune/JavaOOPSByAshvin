/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructors;

/**
 *
 * @author DELL-PC
 */
class Student {
   String name;                                  //String Name="Ashvin";     //this is also not good way         
   int sid;                                            // int sid=101;
}
public class Test{
    public static void main(String args[])
    {
        Student s1=new Student();              // Not good way beacause we have to initialize object    
        
        Student s2=new Student();
        s2.name="Ashvin";                      //THis is also one approach but it occupies much space
        s2.sid=102;
    }
}
