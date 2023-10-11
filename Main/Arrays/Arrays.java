package Main.Arrays;

public class Arrays {
    public static void main(String[] args) {
        // String[] cars = {"Camaro", "cORVETTE", "Tesla"};
        // cars[0] = "Mustang";
        // System.out.println(cars[0]);

        String[] arr = new String[3];

        arr[0] = "Camaro";
        arr[1] = "Corvette";
        arr[2] = "Tesla";

        System.out.println(arr[1]);

        for(int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]); 
        }
    }
}
