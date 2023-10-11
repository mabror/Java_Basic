package Main.Interface;

public class Main {
    public static void main(String[] args) {
        // interface = a template that  can be applied to a class.
        //             similiar to inheritance, but specifies what a class has/must do.
        //             classes can apply more than one interface, inheritance is limited to 1 superclass
    
        // Rabbit rabbit = new Rabbit();

        // rabbit.flee();

        // Hawk hawk = new Hawk();

        // hawk.hunt();
        // hawk.flee(); error


        FIsh fish = new FIsh();

        fish.hunt();
        fish.flee();
    
    }
}
