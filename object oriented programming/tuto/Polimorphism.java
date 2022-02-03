// It simply means more than one form. 
// That is, the same entity (method or operator or object) 
// behaves differently in different scenarios

int a = 4;
int b = 3;
int total = a + b;

String s1 = "abc ";
String s2 = "xyz";
String s3 = s1 + s2;




class Animal {
   public void makeSound();
}

class Dog extends Animal {
   @Override
   public void makeSound() {
      System.out.println("Bark bark..");
   }
}

class Cat extends Animal {
   @Override
   public void makeSound() {
      System.out.println("Meow meow..");
   }
}

class Main {
   public static void main(String[] args) {
      Dog  d1 = new Dog();
      d1.makeSound(); // Bark Bark..

      Cat c1 = new Cat();
      c1.makeSound(); //Meow meow..
   }
}


class Demo {
 public void displayPattern(){
   for(int i = 0; i < 10; i++) {
     System.out.print("*");
   }
 }

 public void displayPattern(char symbol) {
   for(int i = 0; i < 10; i++) {
     System.out.print(symbol);
   }
 }
}

class Main {
 public static void main(String[] args) {
   Demo d1 = new Demo();
   d1.displayPattern(); //**********
   System.out.println("\n");
   d1.displayPattern('#');//##########
 }
}



class Animal {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}

class Dog extends Animal {
   @Override
   public void displayInfo() {
      System.out.println("I am a dog.");
   }
}

class Main {
   public static void main(String[] args) {
    
    // declaration of object variable a1 of the Animal class
    Animal a1;
    
    // object creation of the Animal class
    a1 = new Animal();
    a1.displayInfo(); // I am an animal

    // object creation of the dog class
    a1 = new Dog();
    a1.displayInfo(); // I am a dog
   }
}