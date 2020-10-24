/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author DELL-PC
 */
class A
{
    public void show()
    {
        
        System.out.print("Parent");
        return;
    }
}
class B extends A{
    B()
    {
        System.out.print("Child");
    }
}
public class Test {
    public static void main(String args[])
    {
        B p=new B();
        p.show();
        int s[][]={{1,2},{1,2}};
        System.out.println(s);
    }
}
