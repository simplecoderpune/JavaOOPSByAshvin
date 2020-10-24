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
class Student1{
    String name;
    int sid;
    Student1(String n,int d)
    {
        name=n;
        sid=d;
    }
}

public class Parametrized {
    public static void main(String args[])
    {
     Student1 s1=new Student1("Deepak",101);   //Good way to initialize   
    }
}
