package Main.DataTypes;

public class Printf {
    public static void main(String[] args){
        // printf() = an optional method to control , format , and display text to the console window
        //             two arguments = format string  + (obeject/variable/value)
        //             % [flags] [precision] [width] [conversion-character]

        System.out.printf("%d This is a format string ", 123);


        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1999;

        // [conversion-character]
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

    }
}
