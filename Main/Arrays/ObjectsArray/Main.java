package Main.Arrays.ObjectsArray;

public class Main {
    public static void main(String[] args){
        // int[] numbers = new int[3];
        // char[] characters = new char[4];
        // String[] strings = new String[5];

        // Food[] refrig = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hotdog");

        Food[] refrig = {food1, food2, food3};

        System.out.println(refrig[0].name);
    }
}
