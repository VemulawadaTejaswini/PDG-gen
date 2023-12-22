import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);

        String c_input        = scan.next();
        
        char c = c_input.charAt(0);
            
        if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
          System.out.println("vowel");
        else
          System.out.println("consonant");
        
	  }
}