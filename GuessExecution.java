package guesss;

import java.util.Random;
import java.util.Scanner;

public class GuessExecution {

    public static int genrator() {
        Random r = new Random();
        return r.nextInt(10) - 0;

    }

    public static void guess(boolean b) {
        while (b) {
            Scanner sc = new Scanner(System.in);

            int x = genrator();

            System.out.println("welcome to the guess game ");

            for (int i = 0; i < 5; i++) {
                System.out.print("try guessing the number : ");
                int guessedNumber = sc.nextInt();
                System.out.println("");
                if (guessedNumber == x) {
                    System.out.println("congratulations you have guessed the correct number");
                    break;

                } else if (guessedNumber > x) {
                    System.out.printf(
                            "the number entered  is greater than the number to be guessed \nyou only have %d chances left \n",
                            4 - i);

                } else if (guessedNumber < x) {
                    System.out.printf(
                            "the number entered  is lesser than the number to be guessed \nyou only have %d chances left \n",
                            4 - i);
                }

            }

            System.out.println("would you like to play again \n press 0 to withdraw 1 to continue  ?");
            int s = sc.nextInt();
            if (s == 0) {
                break;
            }
        }
    }

}
