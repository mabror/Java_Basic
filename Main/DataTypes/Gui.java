package Main.DataTypes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {
        // String name = JOptionPane.showInputDialog("Enter your name");
        // JOptionPane.showMessageDialog(null, "Hello " + name);

        // String age = JOptionPane.showInputDialog("Enter your age");
        // JOptionPane.showMessageDialog(null, "Your are " + age);

        // String day = "Sunday";
        // switch(day) {
        //     case "Sunday": System.out.println("Its sunday!");
        //     break;
        //     case "Monday": System.out.println("Its monday!");
        //     break;
        //     case "Wendesday": System.out.println("Its wednesday!");
        //     break;
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Youre playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q")  && !response.equals("Q")) {
            System.out.println("You re still playing game pew pew");
        }

        else {
            System.out.println("You quit the game");
        }

    // }
    }
}
