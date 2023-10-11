package Main.DataTypes;

public class StringMethods {
    public static void main(String[] args) {
        // String = a reference data type that can store one or more characters
        // reference data types have access to useful methods

        String name = "Bro  ";

        // boolean result = name.equals("Bro");
        // int result = name.length();
        // char result = name.charAt(2);
        // int result = name.indexOf("B");
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();   remove spaces
        String result = name.replace("o", "a");


        System.out.println(result);
    }
}
