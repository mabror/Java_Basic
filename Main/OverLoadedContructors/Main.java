package Main.OverLoadedContructors;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzereloo", "peperoni");

        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);


    }
}
