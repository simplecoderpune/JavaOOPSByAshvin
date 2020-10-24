/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author DELL-PC
 */

interface interf
{
    void m1();
    void m2();
 /*   void m3()
    {
        
    }*/ //Abstract class method doesnt contains body
}
abstract class B implements interf
{
    /*void m1()
    {
         We have not defined it as public so it will not work giving less privileage   
    
    }*/
    
   public void m1()
   {
       
   }
   // If you don't know about proper implementation just declare class as abstract no probelm
   
   
}

public class Test extends B {
public void m2()
{
                                       //EVeerything is fine now
}
    
}
