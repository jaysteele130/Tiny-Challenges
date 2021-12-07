import uulib.Console;
import uulib.ArrayUtils;

public class Main {

    // Challenge 
    public static void countdown(int x) {
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
        countdown(10);
    }

    // Challenge Question 2
    public static void question2() {
        //get string input
        String msg = Console.getString("Enter String: ");
        //string is in morse
        String morseMsg = Morse.messageToMorse(msg);

        System.out.println(morseMsg);

        //morse back into english
        String englishMsg = Morse.messageFromMorse(morseMsg);
        System.out.println("Back to English: " + englishMsg);

    }

    public static void main(String[] args) {

        //question1();
        question2();

    }

}