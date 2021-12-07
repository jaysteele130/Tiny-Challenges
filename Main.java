import uulib.Console;
import uulib.ArrayUtils;

public class Main {

    // Challenge question 1
    public static void countdown(int x) {
        // complete this method
        //initialisation
        int count = 0;
        char currentLetter = ' ';
        //array
        char[] code = {'C', 'O', 'D', 'E'};

        //whilst i = x, if i is less than 0, minus i
        for(int i = x; i > 0; i--) {
           currentLetter = code[count];
           System.out.println(i + " " + currentLetter);

           if(count == 3) {
                count = -1;
            }
           count++; //incriment
           
        }

    }

    public static void question1() {
        // COMPLETE THIS METHOD
        countdown(10);
    }

    // Challenge Question 2
    public static void question2() {
        // Create an interactive program that calls the methods in the morse class to
        // prove they work
        // Morse.messageToMorse("the quick brown") and Morse.messageFromMorse("._ /
        // ....") to prove they work
        String msg = Console.getString("Enter String: ");
        String morseMsg = Morse.messageToMorse(msg);

        System.out.println(morseMsg);

        String englishMsg = Morse.messageFromMorse(morseMsg);
        System.out.println("Back to English: " + englishMsg);

    }

    public static void main(String[] args) {

        //question1();
        question2();

    }

}