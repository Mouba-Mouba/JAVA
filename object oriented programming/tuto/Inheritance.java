/*
Inheritance is an is-a relationship. 
We use inheritance only if an is-a relationship is present between the two classes.

Here are some examples:

A car is a vehicle.
Orange is a fruit.
A surgeon is a doctor.
A dog is an animal.
*/







class Animal{
    // eat() method
    // sleep() method
}

class Dog extends Animal{
    // bark() method
}














class Animal {

   public void eat() {
      System.out.println("I can eat");
   }

   public void sleep() {
      System.out.println("I can sleep");
   }
}

class Dog extends Animal {
   public void bark() {
      System.out.println("I can bark");
   }
}

class Main {
   public static void main(String[] args) {

      Dog dog1 = new Dog();

      dog1.eat(); //I can eat
      dog1.sleep(); // I can Sleep

      dog1.bark(); //I can bark
   }
}









class Animal {
   private String type = "animal";

   public void eat() {
      System.out.println("I can eat");
   }

   public void sleep() {
      System.out.println("I can sleep");
   }
}

class Dog extends Animal {
  
   @Override
   public void eat() {
      System.out.println("I eat dog food");
   }

   public void bark() {
      System.out.println("I can bark");
   }
}

class Main {
   public static void main(String[] args) {

      Dog dog1 = new Dog();
      dog1.eat(); // I eat dog food
      dog1.sleep(); // I can sleep
      dog1.bark(); //I can bark
   }
}




class Animal {
   public Animal() {
     System.out.println("I am an Animal");
   }

   public void eat() {
     System.out.println("I can eat");
   }
}

class Dog extends Animal {
   public Dog(){
      super();
      System.out.println("I am a dog");
   }

  @Override
  public void eat() {
     super.eat();
     System.out.println("I eat dog food");
  }

   public void bark() {
      System.out.println("I can bark");
   }
}

class Main {
   public static void main(String[] args) {
      Dog dog1 = new Dog(); // I am an animal

      dog1.eat(); // I can eat
                  // I eat dog food
      dog1.bark();// I can bark
   }
}