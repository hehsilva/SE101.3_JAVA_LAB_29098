
package com.mycompany.animal;
public class Animal 
{

    public static void main(String[] args) 
    {
      Animal a = new Animal();
      Mammel m = new Mammel();
      Dog d = new Dog();
      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammel);
      System.out.println(d instanceof Animal);

    }
}
