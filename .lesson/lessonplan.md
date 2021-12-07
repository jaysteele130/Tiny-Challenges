# Practical 12 Solutions

## Question 1

### Solution using a String to store CODE
```
public static void countdown(int num) {
    String code = "CODE";

    int p = 0; // position of char in code to print - initially the first char 
    for(int i = num; i > 0; i = i - 1) {
        // print i and char at position p in code string
        System.out.println(String.format("%4d",i) + " " + code.charAt(p)); 

        // increment p, resetting back to 0 when divisible by length of code string
        p = (p + 1) % code.length();   
        
        // Alternatively use an if statement
        //if (p >= code.length) {
        //    p = 0;
        //}            
    }
}
```

### Solution using an array to store CODE

```
public static void countdown1(int num) {
    char[] code = { 'C', 'O', 'D', 'E'};    

    int p = 0;  // position of char in code to print - initially the first char 
    for(int i = num; i > 0; i = i - 1) {
        // print i and char at position p in code array
        System.out.println(String.format("%4d",i) + " " + code[p]); 

        // increment p, resetting back to 0 when divisible by length of code array
        p = (p + 1) % code.length;          
    }
}
```


# Question 2

```
public static String messageToMorse(String msg) {
    String morse = "";
    for(int i = 0; i < msg.length(); i = i + 1) {
        char c = msg.charAt(i);
        morse = morse + charToMorseCode(c);
        // each morse code is separated by a space 
        morse = morse + " ";
    }
    return morse;
}

public static String messageFromMorse(String morse) {
    // split morse into tokens at each space
    StringTokenizer tokenizer = new StringTokenizer(morse, " ");
               
    // extract each token from tokenizer and add to text
    String text = "";
    while(tokenizer.hasMoreTokens()) {
        String token = tokenizer.nextToken();
        text = text + charFromMorseCode(token);
    }
    return text;
}
```
