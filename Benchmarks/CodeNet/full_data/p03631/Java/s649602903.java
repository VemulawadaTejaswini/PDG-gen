import java.util.*;
import java.lang.String;

class isPalindromeNum{
   public static void main(String[] argv){
      String N;
      boolean palindrome = true;
      
      Scanner stdIn = new Scanner(System.in);
      N = stdIn.next();
      
      for(int i = 0; i <= N.length()/2; i++){
         if(N.charAt(i)!=N.charAt(N.length()-i-1)){
            palindrome = false;
         }
      }
      
      if(palindrome){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
   }
}