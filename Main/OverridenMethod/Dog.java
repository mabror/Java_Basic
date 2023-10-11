package Main.OverridenMethod;

public class Dog extends Animal {
    
    @Override
    void speak() {
        System.out.println("The animal speaks *barks*");
    }
}
