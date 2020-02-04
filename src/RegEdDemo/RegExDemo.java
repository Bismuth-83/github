package RegEdDemo;
import java.util.Scanner;
public class RegExDemo {
    public static String inputSSN(){
        String theSSN="";
        Scanner input = new Scanner(System.in);
        //sentinel loop - loop until 9 digits are entered
        do{
            System.out.println("Enter 9 digits");
            theSSN = input.nextLine();
            
        }while(theSSN.length()!=9 || !theSSN.matches("^[+]?\\d*$"));
        return theSSN;
    }
    public static boolean validSSN(String SSN){
        if(SSN.matches("^\\d{3}-\\d{2}-\\d{4}$")){
        return true;
    } else {
            return false;
        }
    }
    public static void main(String[] args) {
    //^\d{3}-\d{2}-\d{4}$//
    //http://regexlib.com/REDetails.aspx?regexp_id=9 //
    
    String someSSN = inputSSN();
    
    //Substring manipulation//
    
    String fixedSSN = someSSN.substring(0,3) + "-" + someSSN.substring(3,5) + "-" + someSSN.substring(5);
        System.out.println(fixedSSN);
 
    //////////////////////////
    
    if(validSSN(fixedSSN)){
        System.out.println("Valid");
    } else {
        System.out.println("Invalid");
    }
    }    
}
