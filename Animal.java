/*In the following code I am creating a package
using the "package" keyword, we are currently in the subfolder of the com package called
dog package
the way I used lower cases to create the package is part of naming conversion
 */
package com.animalpackage;

//I created a class using the public access modifier and the keyword "class" followed by the class name "Animal"


public class Animal {
    //the methods are public so that they can be accessed by the default package using the dog object
   public void eat(String food){
        System.out.println("I eat "+ food);

    }

    public void noise(String sound){
        System.out.println("This is the sound I make "+ sound);
    }

   public void legs(int legs){
        System.out.println("I have "+ legs+" legs");
    }

}
