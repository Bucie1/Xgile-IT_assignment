/*In the following code I am creating a package
using the "package" keyword, and we are currently in the subfolder of the com package called
dog package
 */
package com.dogpackage;

import com.animalpackage.Animal;

//Dog class inherits the Animal class. Inheritance was enabled by the keyword "extends"
public class Dog extends Animal {

  public void constructor(){
        System.out.println("Hey there.....Yes i am an animal " +
                "which animal u ask? well im a dog :) and my named is Max ");
    }
//to showcase the access modifiers I created different variables with different modifiers
    public String dogFood="bones";
    private String sound = "woof";
    protected int legs =4;
 //I made a public set method for the sound variable, we can set its value because its private
    public void setSound(String sound){
      this.sound = sound;
    }
  //I made a public get method for the sound variable, we can set its value because its private
  public String getSound(){
    return sound;
  }
  //I made a public set method for the legs variable, we can set its value because its protected
  public void setLegs(int legs){
    this.legs=legs;
  }
  //I made a public set method for the legs variable, we can set its value because its protected
  public int getLegs(){
    return legs;
  }


}

