/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javasingleton;





public class Javasingleton {

    
    public static void main(String[] args) {
        // TODO code application logic here
        singletonexample obj=singletonexample.methodforsingleton();
        singletonexample obj2=singletonexample.methodforsingleton();
        obj.showMessage();
         obj2.showMessage();
         System.out.println(obj);
         System.out.println(obj2);
    }
}
