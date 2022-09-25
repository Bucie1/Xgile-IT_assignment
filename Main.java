
import com.dogpackage.Dog;



public class Main {
   public static void main(String[] args) {

      Dog dog;

      {
         //creating an object the dog class
         dog = new Dog();
         dog.constructor();
         dog.eat(dog.dogFood);
         dog.noise(dog.getSound());
         dog.legs(dog.getLegs());

      }

   }
}