class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("The bird is pecking at its food.");
    }

    @Override
    public void sleep() {
        System.out.println("The bird is sleeping in its nest.");
    }

    public void fly() {
        System.out.println("The bird is flying in the sky.");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        // Creating an instance of Animal
        Animal animal = new Animal();
        animal.eat();   
        animal.sleep();  
        // Creating an instance of Bird
        Bird bird = new Bird();
        bird.eat();      
        bird.sleep();    
        bird.fly();     
    }
}
