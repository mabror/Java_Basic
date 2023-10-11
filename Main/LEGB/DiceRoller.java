package Main.LEGB;

import java.util.Random;

public class DiceRoller {
    // global
    Random random;
    int number = 0;
    DiceRoller() {
        random = new Random(0);     // local
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
