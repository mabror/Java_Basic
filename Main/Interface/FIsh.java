package Main.Interface;

public class FIsh implements Predator, Prey {

    @Override
    public void flee() {
        System.out.println("*This fish  is fleeing from another large fish*");
    }

    @Override
     public void hunt(){
        
        System.out.println("*THis fish is hunting smaller fish*");
     }
}
