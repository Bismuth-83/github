package exercise5;
import java.util.Scanner;
public class CountWords {

    public static void main(String[] args) {
        String phrase;
        int wordCount;  
        
        Scanner input = new Scanner(System.in);
        
       
        System.out.println("Please enter a phrase");
        phrase = input.nextLine();
        phrase = phrase + " ";
        wordCount = countWords(phrase);
        System.out.println(wordCount);
        
        
    }
    
    public static int countWords(String phrase){
        
        int words = 0;
        char theLetter;
        int letter = 0;
        
        for(int c = 0; c < phrase.length(); c++){
            theLetter = phrase.charAt(c);
            if(Character.isLetter(theLetter)){
                letter++;
            } else if(letter > 0){
                words++;
                letter = 0;
            }
        }
        return words;
    }
}
