/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataHiding;
import java.util.*;
/**
 *
 * @author DELL-PC
 */

class Hiding
{
    private int balance;
    private String username;
    private String password;
    Hiding(int b,String u,String p)
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
    }
}

public class Test {
    public static void main(String args[])
    {
        Hiding h1=new Hiding(23390,"Ashvin","ASDF");
        int r=h1.getbalance("Ashvin", "ASDF");
        if(r==-1)
        {
            System.out.println("Incorrect Username & Password");
        }
        else
        {
            System.out.println("Balance="+r);
        }
         Hiding h2=new Hiding(23390,"Ashvin","ASDF");
        r=h2.getbalance("Ash", "ASDF");
        if(r==-1)
        {
            System.out.println("Incorrect Username & Password");
        }
        else
        {
            System.out.println("Balance="+r);
        }
    }
}
