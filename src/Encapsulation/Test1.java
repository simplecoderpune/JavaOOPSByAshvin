/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;
import java.util.*;
/**
 *
 * @author DELL-PC
 */

class Encapsulation
{
    private int balance;
    private String username;
    private String password;
    Encapsulation(int b,String u,String p)
    {
        balance=b;
        username=u;
        password=p;
    }
    public int getbalance(String username,String password)
    {
        if(username==this.username && password==this.password)
        {
            return this.balance;
        }
        return -1;
    }                                                                   //////////Data Hiding+Abstraction
    public void setBalance(int balance)
    {
        this.balance=this.balance+balance;
    }
}

public class Test1 {
    public static void main(String args[])
    {
        Encapsulation h1=new Encapsulation(23390,"Ashvin","ASDF");
        int r=h1.getbalance("Ashvin", "ASDF");
        if(r==-1)
        {
            System.out.println("Incorrect Username & Password");
        }
        else
        {
            System.out.println("Balance="+r);
        }
         Encapsulation h2=new Encapsulation(23390,"Ashvin","ASDF");
        r=h2.getbalance("Ash", "ASDF");
        if(r==-1)
        {
            System.out.println("Incorrect Username & Password");
        }
        else
        {
            System.out.println("Balance="+r);
        }
        h2.setBalance(2000); //// so when user will click on set button on atm then he doent know about its implementation
        
    }
}
