public class FirstNoneRepeat {

    public static void main(String ...args){
        System.out.println("This program will identify the first none repeated character for a user entered String");
        repeatCharacterCheck("aabbcch");
    }

    static void repeatCharacterCheck(String s){
        
        Character firstNoneRepeatCharacter = null;

        for (int i=0; i < s.length() - 1; i++){
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            if (first != second){
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
    
}
