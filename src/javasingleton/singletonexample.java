/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javasingleton;


public class singletonexample
{
    
    private singletonexample()
    {}
    
    private static final singletonexample instobj=new singletonexample();
    
    public static singletonexample methodforsingleton()
    {
        return instobj;
    }
   
     public void showMessage(){
      System.out.println("Hello World!");
   }
}