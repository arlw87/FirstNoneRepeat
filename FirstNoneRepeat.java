import java.util.*;

public class FirstNoneRepeat {

    public static void main(String ...args){
        System.out.println("This program will identify the first none repeated character for a user entered String");
        System.out.println("Please enter a sequence of characters");
        String input = getInput();
        repeatCharacterCheck(input);
        System.out.println("Program has ended");
    }

    static void repeatCharacterCheck(String s){
        
        Character firstNoneRepeatCharacter = null;

        for (int i=0; i < s.length() - 1; i++){
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            if (first != second){
                //i+2 doesnt throw error if at the end of string as 
                //i == s.length() - 2 will evaluate to false first and
                //the second statement will not be evaluated
                if (i == s.length() - 2 || second != s.charAt(i+2)){
                    firstNoneRepeatCharacter = second;
                    break;
                }
            }
        }

        if (firstNoneRepeatCharacter == null){
            System.out.print("All characters repeat");
        } else {
            System.out.println("The first none repeating character is " + firstNoneRepeatCharacter);
        }

    }

    static String getInput(){
        Scanner input = new Scanner(System.in);
        return input.next().trim();
    }
    
}
