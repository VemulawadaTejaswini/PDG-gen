import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      
      String s = sc.nextLine();
      
      if(s.charAt(0) != 'A')
         System.out.println("WA");
      else if(Character.isUpperCase(s.charAt(1)) || Character.isUpperCase(s.charAt(s.length()-1)))
         System.out.println("WA");
      else {
         int count = 0;
         for(int i = 2; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)) && count == 1) {
               System.out.println("WA");
               System.exit(0);
            }
            if(s.charAt(i) == 'C')
               count++;  
         }
         if(count != 1)  
            System.out.println("WA");
         else 
            System.out.println("AC");
      }
   }
}