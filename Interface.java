// Interface
interface Animal {
    int LEGS = 4; 

    void sound();  
}


class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        System.out.println("Legs: " + Animal.LEGS);
    }
}
