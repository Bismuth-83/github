package chapter.pkg7;

public class LetterCount
{
    
    //Private Data Variables//
    
    private String phrase;
    private int digits;
    private int letters;
    private int spaces;
    private int other;

    
    //Getters and Setters//
    
    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getDigits() {
        return digits;
    }

    public void setDigits(int digits) {
        this.digits = digits;
    }

    public int getLetters() {
        return letters;
    }

    public void setLetters(int letters) {
        this.letters = letters;
    }

    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }
    
    //Constructors//
    //Default Constructor//
    //Used to set basic beginning stages//
    //(Left blank for this exercise)//
   
    public LetterCount() {
    }
    
    //Parameterized one//

    public LetterCount(String phrase, int digits, int letters, int spaces, int other) {
        this.phrase = phrase;
        this.digits = digits;
        this.letters = letters;
        this.spaces = spaces;
        this.other = other;
        countTheLetters();
    }
    
    //Another parameterized constructor//

    public LetterCount(String phrase) {
        this.phrase = phrase;
        countTheLetters();
    }

    //toString()//

    @Override
    public String toString() {
        return "LetterCount{" + "phrase=" + phrase + ", digits=" + digits + ", letters=" + letters + ", spaces=" + spaces + ", other=" + other + '}';
    }
    
    //Method functions//
    //Functionality of the class//
    //Things you do in the class//
    
    public void countTheLetters(){
        
        char theLetter;
                
        for(int c = 0; c < phrase.length(); c++){
            theLetter = phrase.charAt(c);
            
            if(Character.isDigit(theLetter)){
                digits++;
            }else if(Character.isLetter(theLetter)){
                letters++;
            } else if(Character.isSpaceChar(theLetter)) {
                spaces++;
            } else {
                other++;
            }
            
        }
    }
    
}
