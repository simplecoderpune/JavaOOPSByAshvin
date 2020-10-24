/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*-------JDK 7 implementation---------JDK 7 Implementation------------JDK 7 Implementation-------------------JDK 7 Implementation-------------JDK 7 Implementation--------------------- */
package MultipleInheritance;
import java.util.*;
/**
 *
 * @author DELL-PC
 */

interface A
{
    void show();
}
interface B
{
    void show();
}
class C implements A,B
{
    public void show()
    {
        System.out.println("Show");
    }
}
public class Test3 {
    public static void main(String args[])
    {
        C c=new C();
        c.show();
    }
}


/*-----------------JDK 8 implementation--------------JDK 8 Implementation--------------JDK 8 Implementation ------------JDK 8 Implementation ---------- JDK 8 Implementation----------- */
interface D
{
    default void show()
    {
        System.out.println("Show from D");
    }
}
interface E
{
    default void show()
    {
        System.out.println("Show from E");
    }
}
class F implements D,E
{
    public void show()
    {
        D.super.show();
        E.super.show();
    }
    public static void main(String args[])
    {
       F f=new F();
       f.show();
    }
}
/*-----------------JDK 8 implementation--------------JDK 8 Implementation--------------JDK 8 Implementation ------------JDK 8 Implementation ---------- JDK 8 Implementation-------*/