package Palindrome;
import java.util.Scanner;
public class Palindrome {
    static String phrase, fixedPhrase;
    static Scanner input = new Scanner(System.in);
    
    public static void fixThePhrase(){
        //Turns the string to lowercase then replaces all spaces with nothing, and kills the apostrophe,
//      // not sure what the last part is doing but it is important
        fixedPhrase = phrase.toLowerCase().replaceAll(" ","").replaceAll("'","").replaceAll("\\.","");
        
    }
    
    public static void checkPalindrome(){
        //flip that string//
        
        String reverse= "";
        for(int c =fixedPhrase.length()-1; c>=0; c--){
            reverse += fixedPhrase.charAt(c);
            
        }
        if(fixedPhrase.equals(reverse)){
            System.out.println(phrase + " is a palindrome");
        }
        else{
            System.out.println(phrase + " aint it chief");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Enter a phrase");
        phrase = input.nextLine();
        
        fixThePhrase();
        System.out.println(fixedPhrase);
        checkPalindrome();
    }
    
}
