package exercise5;

public class countWordsClass {

    //Private Data Variables//
    
    private String phrase;
    private int wordCount;

    //Getters and Setters//    
    
    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
    
    //Constructors//

    public countWordsClass() {
    }

    public countWordsClass(String phrase, int wordCount) {
        this.phrase = phrase;
        this.wordCount = wordCount;
        countWords();
    }

    public countWordsClass(String phrase) {
        this.phrase = phrase;
        countWords();
    }
    
    
    
    //toString()//
    
    @Override
    public String toString() {
        return "countWordsClass{" + "phrase=" + phrase + ", wordCount=" + wordCount + '}';
    }
    
    //Method Function//
    
    public void countWords(){
        
        char theLetter;
        char theNextLetter;
        for(int c = 0; c < phrase.length(); c++){
            theLetter = phrase.charAt(c);
            theNextLetter = phrase.charAt(c+1);
            if(Character.isLetter(theLetter) && (!Character.isLetter(theNextLetter))){
                wordCount++;
            }
        }
    }
    
    
}
