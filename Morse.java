import java.util.StringTokenizer;

public class Morse {

    // ==================Encode a message string into a morse code string ==============

    // COMPLETE THIS METHOD 
    public static String messageToMorse(String msg) {
        String morse = ""; // intialisation

        char letter = ' ';

        for(int i = 0; i < msg.length(); i++) {

            letter = msg.charAt(i); //letter of morse

            morse += charToMorseCode(letter) ;
            if(i < msg.length() - 1) {
                morse += " "; //space and not adding spcae to the word
            }
        }
        
        return morse; // return the morse string version of the message
    }

    // ================== Decode morse string into plain text message =======================

    public static String messageFromMorse(String morse) {
        // tokenizer splits morse into tokens at each space char,  as show in example below
        //            0   1  2 
        // morse = "--.- ..- .." 
        String msg = ""; // holds decoded message
        StringTokenizer tokenizer = new StringTokenizer(morse, " ");

        
        while(tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken(); //gets new token
            char tokenLetter = charFromMorseCode(token);
            msg += tokenLetter;

            
        }
        
    
        return msg; // return decoded message
    }


    // encode a character into its morse code
    public static String charToMorseCode(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a') {
            return "._";
        } else if (c == 'b') {
            return "_...";
        } else if (c == 'c') {
            return "_._.";
        } else if (c == 'd') {
            return "_..";
        } else if (c == 'e') {
            return ".";
        } else if (c == 'f') {
            return ".._.";
        } else if (c == 'g') {
            return "__.";
        } else if (c == 'h') {
            return "....";
        } else if (c == 'i') {
            return "..";
        } else if (c == 'j') {
            return ".___";
        } else if (c == 'k') {
            return "_._";
        } else if (c == 'l') {
            return "._..";
        } else if (c == 'm') {
            return "__";
        } else if (c == 'n') {
            return "_.";
        } else if (c == 'o') {
            return "___";
        } else if (c == 'p') {
            return ".__.";
        } else if (c == 'q') {
            return "__._";
        } else if (c == 'r') {
            return "._.";
        } else if (c == 's') {
            return "...";
        } else if (c == 't') {
            return "_";
        } else if (c == 'u') {
            return ".._";
        } else if (c == 'v') {
            return "..._";
        } else if (c == 'w') {
            return ".__";
        } else if (c == 'x') {
            return "_.._";
        } else if (c == 'y') {
            return "_.__";
        } else if (c == 'z') {
            return "__..";
        }  else if (c == ' ') {
            return "/";
        } else {
            return "#"; // unknown
        }
    }

     // decode a morse code into the relevant character
    public static char charFromMorseCode(String m) {        
        if (m.equals("._")) {
            return 'a';
        } else if (m.equals("_...")) {
            return 'b';
        } else if (m.equals("_._.")) {
            return 'c';
        } else if (m.equals("_..")) {
            return 'd';
        } else if (m.equals(".")) {
            return 'e';
        } else if (m.equals(".._.")) {
            return 'f';
        } else if (m.equals("__.")) {
            return 'g';
        } else if (m.equals("....")) {
            return 'h';
        } else if (m.equals("..")) {
            return 'i';
        } else if (m.equals(".___")) {
            return 'j';
        } else if (m.equals("_._")) {
            return 'k';
        } else if (m.equals("._..")) {
            return 'l';
        } else if (m.equals("__")) {
            return 'm';
        } else if (m.equals("_.")) {
            return 'n';
        } else if (m.equals("___")) {
            return 'o';
        } else if (m.equals(".__.")) {
            return 'p';
        } else if (m.equals("__._")) {
            return 'q';
        } else if (m.equals("._.")) {
            return 'r';
        } else if (m.equals("...")) {
            return 's';
        } else if (m.equals("_")) {
            return 't';
        } else if (m.equals(".._")) {
            return 'u';
        } else if (m.equals("..._")) {
            return 'v';
        } else if (m.equals(".__")) {
            return 'w';
        } else if (m.equals("_.._")) {
            return 'x';
        } else if (m.equals("_.__")) {
            return 'y';
        } else if (m.equals("__..")) {
            return 'z';
        }  else if (m.equals("/")) {
            return ' ';
        } else {
            return '#'; // unknown
        }
    }
    

    // ======================================  Tests ===================================

    public static void TestCharToMorse() {
        Assert(charToMorseCode('a').equals( "._"),   "charToMorseCode('a')");
        Assert(charToMorseCode('b').equals( "_..."), "charToMorseCode('b')");
        Assert(charToMorseCode('c').equals( "_._."), "charToMorseCode('c')");
        Assert(charToMorseCode('d').equals( "_.."),  "charToMorseCode('d')");
        Assert(charToMorseCode('e').equals( "."),    "charToMorseCode('e')");
        Assert(charToMorseCode('f').equals( ".._."), "charToMorseCode('f')");
        Assert(charToMorseCode('g').equals( "__."),  "charToMorseCode('g')");
        Assert(charToMorseCode('h').equals( "...."), "charToMorseCode('h')");
        Assert(charToMorseCode('i').equals( ".."),   "charToMorseCode('i')");
        Assert(charToMorseCode('j').equals( ".___"), "charToMorseCode('j')");
        Assert(charToMorseCode('k').equals( "_._"),  "charToMorseCode('k')");
        Assert(charToMorseCode('l').equals( "._.."), "charToMorseCode('l')");
        Assert(charToMorseCode('m').equals( "__"),   "charToMorseCode('m')");
        Assert(charToMorseCode('n').equals( "_."),   "charToMorseCode('n')");
        Assert(charToMorseCode('o').equals( "___"),  "charToMorseCode('o')");
        Assert(charToMorseCode('p').equals( ".__."), "charToMorseCode('p')");
        Assert(charToMorseCode('q').equals( "__._"), "charToMorseCode('q')");
        Assert(charToMorseCode('r').equals( "._."),  "charToMorseCode('r')");
        Assert(charToMorseCode('s').equals( "..."),  "charToMorseCode('s')");
        Assert(charToMorseCode('t').equals( "_"),    "charToMorseCode('t')");
        Assert(charToMorseCode('u').equals( ".._"),  "charToMorseCode('u')");
        Assert(charToMorseCode('v').equals( "..._"), "charToMorseCode('v')");
        Assert(charToMorseCode('w').equals( ".__"),  "charToMorseCode('w')");
        Assert(charToMorseCode('x').equals( "_.._"), "charToMorseCode('x')");
        Assert(charToMorseCode('y').equals( "_.__"), "charToMorseCode('y')");
        Assert(charToMorseCode('z').equals( "__.."), "charToMorseCode('z')");
        Assert(charToMorseCode(' ').equals( "/"),    "charToMorseCode(' ')");

        Assert(charToMorseCode('A').equals( "._"),   "charToMorseCode('A')");
        Assert(charToMorseCode('B').equals( "_..."), "charToMCodeorse('B')");
        Assert(charToMorseCode('C').equals( "_._."), "charToMorseCode('C')");
        Assert(charToMorseCode('D').equals( "_.."),  "charToMorseCode('D')");
        Assert(charToMorseCode('E').equals( "."),    "charToMorseCode('E')");
        Assert(charToMorseCode('F').equals( ".._."), "charToMorseCode('F')");
        Assert(charToMorseCode('G').equals( "__."),  "charToMorseCode('G')");
        Assert(charToMorseCode('H').equals( "...."), "charToMorseCode('H')");
        Assert(charToMorseCode('I').equals( ".."),   "charToMorseCode('I')");
        Assert(charToMorseCode('J').equals( ".___"), "charToMorseCode('J')");
        Assert(charToMorseCode('K').equals( "_._"),  "charToMorseCode('K')");
        Assert(charToMorseCode('L').equals( "._.."), "charToMorseCode('L')");
        Assert(charToMorseCode('M').equals( "__"),   "charToMorseCode('M')");
        Assert(charToMorseCode('N').equals( "_."),   "charToMorseCode('N')");
        Assert(charToMorseCode('O').equals( "___"),  "charToMorseCode('O')");
        Assert(charToMorseCode('P').equals( ".__."), "charToMorseCode('P')");
        Assert(charToMorseCode('Q').equals( "__._"), "charToMorseCode('Q')");
        Assert(charToMorseCode('R').equals( "._."),  "charToMorseCode('R')");
        Assert(charToMorseCode('S').equals( "..."),  "charToMorseCode('S')");
        Assert(charToMorseCode('T').equals( "_"),    "charToMorseCode('T')");
        Assert(charToMorseCode('U').equals( ".._"),  "charToMorseCode('U')");
        Assert(charToMorseCode('V').equals( "..._"), "charToMorseCode('V')");
        Assert(charToMorseCode('W').equals( ".__"),  "charToMorseCode('W')");
        Assert(charToMorseCode('X').equals( "_.._"), "charToMorseCode('X')");
        Assert(charToMorseCode('Y').equals( "_.__"), "charToMorseCode('Y')");
        Assert(charToMorseCode('Z').equals( "__.."), "charToMorseCode('Z')");
    }

    // our test Assertion action method
    public static void Assert(boolean result, String msg) {
        if (result == false) {
            System.out.println("FAILED: " + msg);
        } else {
            System.out.println("Passed: " + msg);
        }
    }


   
}