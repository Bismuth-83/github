package chapter.pkg7;
import java.util.Scanner;
public class LetterCountMain{

    public static void main(String[] args){
        LetterCount demo = new LetterCount();
        System.out.println(demo.toString());
        
        LetterCount demo2 = new LetterCount("99 red balloons, flew by, 4 green mules!");
        System.out.println(demo2.toString());
        
    }
    
}
